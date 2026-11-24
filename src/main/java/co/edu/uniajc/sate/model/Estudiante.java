package co.edu.uniajc.sate.model;

public class Estudiante {

    private Long id;
    private final String nombre;
    private final double promedio;
    private final int totalClases;
    private final int inasistencias;

    public Estudiante(Long id, String nombre, double promedio, int totalClases, int inasistencias) {
        this.id = id;
        this.nombre = nombre;
        this.promedio = promedio;
        this.totalClases = totalClases;
        this.inasistencias = inasistencias;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public double getPromedio() { return promedio; }
    public int getTotalClases() { return totalClases; }
    public int getInasistencias() { return inasistencias; }

    public double getPorcentajeInasistencia() {
        if (totalClases <= 0) {
            return 0.0;
        }
        return ((double) inasistencias / totalClases) * 100.0;
    }
}
