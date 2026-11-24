package co.edu.uniajc.sate.factory;

import co.edu.uniajc.sate.model.Alerta;
import co.edu.uniajc.sate.model.AlertaAmarilla;
import co.edu.uniajc.sate.model.AlertaRoja;
import co.edu.uniajc.sate.model.Estudiante;
import co.edu.uniajc.sate.model.TipoAlerta;

/**
 * Patrón Factory Method: encapsula la creación de alertas.
 * Permite agregar nuevos tipos sin modificar a los clientes (principio OCP).
 */
public class AlertaFactory {

    public static Alerta crearAlerta(TipoAlerta tipo, Estudiante estudiante, String descripcion) {
        if (tipo == null) {
            throw new IllegalArgumentException("El tipo de alerta no puede ser nulo.");
        }

        switch (tipo) {
            case AMARILLA:
                // Bajo rendimiento académico (promedio < 3.0)
                return new AlertaAmarilla(estudiante, descripcion);
            case ROJA:
                // Inasistencia crítica (> 15%)
                return new AlertaRoja(estudiante, descripcion);
            default:
                throw new IllegalArgumentException("Tipo de alerta no soportado: " + tipo);
        }
    }
}
