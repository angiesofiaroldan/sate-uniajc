package co.edu.uniajc.sate.repository;

import co.edu.uniajc.sate.model.Estudiante;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class EstudianteRepositoryEnMemoria implements EstudianteRepository {

    private final Map<Long, Estudiante> almacen = new LinkedHashMap<>();
    private long siguienteId = 1L;

    @Override
    public Optional<Estudiante> findById(Long id) {
        return Optional.ofNullable(almacen.get(id));
    }

    @Override
    public List<Estudiante> findAll() {
        return new ArrayList<>(almacen.values());
    }

    @Override
    public Estudiante save(Estudiante estudiante) {
        if (estudiante == null) {
            throw new IllegalArgumentException("El estudiante no puede ser nulo.");
        }
        if (estudiante.getId() == null) {
            estudiante.setId(siguienteId++);
        }
        almacen.put(estudiante.getId(), estudiante);
        return estudiante;
    }

    @Override
    public List<Estudiante> findEstudiantesConInasistenciaSuperiorA(double porcentajeLimite) {
        List<Estudiante> resultado = new ArrayList<>();
        for (Estudiante e : almacen.values()) {
            if (e.getPorcentajeInasistencia() > porcentajeLimite) {
                resultado.add(e);
            }
        }
        return resultado;
    }
}
