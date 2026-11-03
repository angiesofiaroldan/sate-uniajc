package co.edu.uniajc.sate.evaluador;

public class EvaluadorInasistencia {

    private static final double UMBRAL_ALERTA_ROJA = 15.0;

    public boolean evaluarAlertaRoja(int totalClases, int inasistencias) {
        if (totalClases <= 0) {
            throw new IllegalArgumentException("totalClases debe ser mayor que cero");
        }
        if (inasistencias < 0 || inasistencias > totalClases) {
            throw new IllegalArgumentException("inasistencias fuera de rango");
        }
        double porcentaje = ((double) inasistencias / totalClases) * 100.0;
        return porcentaje > UMBRAL_ALERTA_ROJA;
    }
}
