package co.edu.uniajc.sate.repository;

import co.edu.uniajc.sate.model.Estudiante;
import java.util.List;
import java.util.Optional;

/**
 * Patrón Repository: abstrae la fuente de datos para desacoplar
 * la lógica de negocio de la persistencia y facilitar los Mocks en JUnit 5.
 */
public interface EstudianteRepository {

    Optional<Estudiante> findById(Long id);

    List<Estudiante> findAll();

    Estudiante save(Estudiante estudiante);

    List<Estudiante> findEstudiantesConInasistenciaSuperiorA(double porcentajeLimite);
}
