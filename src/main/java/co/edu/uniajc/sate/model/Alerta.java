package co.edu.uniajc.sate.model;

public abstract class Alerta {

    private final Estudiante estudiante;
    private final String descripcion;

    protected Alerta(Estudiante estudiante, String descripcion) {
        this.estudiante = estudiante;
        this.descripcion = descripcion;
    }

    public abstract TipoAlerta getTipo();

    public Estudiante getEstudiante() { return estudiante; }
    public String getDescripcion() { return descripcion; }
}
