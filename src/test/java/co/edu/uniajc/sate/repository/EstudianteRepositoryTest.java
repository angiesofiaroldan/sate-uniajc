package co.edu.uniajc.sate.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import co.edu.uniajc.sate.model.Estudiante;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EstudianteRepositoryTest {

    private EstudianteRepository repository;

    @BeforeEach
    void setUp() {
        repository = new EstudianteRepositoryEnMemoria();
    }

    @Test
    void saveAsignaIdYPermiteBuscarPorId() {
        Estudiante guardado = repository.save(new Estudiante(null, "Ana", 4.0, 20, 2));

        assertNotNull(guardado.getId());
        assertTrue(repository.findById(guardado.getId()).isPresent());
    }

    @Test
    void findAllDevuelveTodosLosEstudiantes() {
        repository.save(new Estudiante(null, "Ana", 4.0, 20, 2));
        repository.save(new Estudiante(null, "Luis", 2.5, 20, 6));

        assertEquals(2, repository.findAll().size());
    }

    @Test
    void filtraEstudiantesConInasistenciaSuperiorAlLimite() {
        repository.save(new Estudiante(null, "Ana", 4.0, 20, 2));   // 10%
        repository.save(new Estudiante(null, "Luis", 2.5, 20, 6));  // 30%

        List<Estudiante> criticos = repository.findEstudiantesConInasistenciaSuperiorA(15.0);

        assertEquals(1, criticos.size());
        assertEquals("Luis", criticos.get(0).getNombre());
    }
}
