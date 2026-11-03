package co.edu.uniajc.sate.evaluador;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvaluadorInasistenciaTest {

    private final EvaluadorInasistencia evaluador = new EvaluadorInasistencia();

    @Test
    void debeGenerarAlertaRojaSiInasistenciaSupera15Porciento() {
        assertTrue(evaluador.evaluarAlertaRoja(20, 4)); // 20%
    }

    @Test
    void noDebeGenerarAlertaRojaSiInasistenciaEsMenorOIgual15Porciento() {
        assertFalse(evaluador.evaluarAlertaRoja(20, 2)); // 10%
    }

    @Test
    void noDebeGenerarAlertaRojaExactamenteEn15Porciento() {
        assertFalse(evaluador.evaluarAlertaRoja(20, 3)); // 15% justo
    }

    @Test
    void debeLanzarExcepcionSiTotalClasesEsCero() {
        assertThrows(IllegalArgumentException.class,
            () -> evaluador.evaluarAlertaRoja(0, 0));
    }

    @Test
    void debeLanzarExcepcionSiInasistenciasSuperanTotal() {
        assertThrows(IllegalArgumentException.class,
            () -> evaluador.evaluarAlertaRoja(20, 25));
    }

    @Test
    void debeLanzarExcepcionSiInasistenciasSonNegativas() {
        assertThrows(IllegalArgumentException.class,
            () -> evaluador.evaluarAlertaRoja(20, -1));
    }
}
