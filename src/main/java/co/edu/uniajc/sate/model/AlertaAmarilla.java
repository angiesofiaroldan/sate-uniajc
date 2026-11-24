package co.edu.uniajc.sate.model;

public class AlertaAmarilla extends Alerta {

    public AlertaAmarilla(Estudiante estudiante, String descripcion) {
        super(estudiante, descripcion);
    }

    @Override
    public TipoAlerta getTipo() {
        return TipoAlerta.AMARILLA;
    }
}
