package co.edu.uniajc.sate.model;

public class AlertaRoja extends Alerta {

    public AlertaRoja(Estudiante estudiante, String descripcion) {
        super(estudiante, descripcion);
    }

    @Override
    public TipoAlerta getTipo() {
        return TipoAlerta.ROJA;
    }
}
