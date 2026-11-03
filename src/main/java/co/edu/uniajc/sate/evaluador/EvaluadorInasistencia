package co.edu.uniajc.sate.evaluador;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvaluadorInasistenciaTest {
    @Test
    void debeGenerarAlertaRojaSiInasistenciaSupera15Porciento() {
        EvaluadorInasistencia evaluador = new EvaluadorInasistencia();
        boolean esAlertaRoja = evaluador.evaluarAlertaRoja(20, 4);
        assertTrue(esAlertaRoja, "Debe retornar true cuando la inasistencia sea > 15%");
    }

    @Test
    void noDebeGenerarAlertaRojaSiInasistenciaEsMenorOIgual15Porciento() {
        EvaluadorInasistencia evaluador = new EvaluadorInasistencia();
        boolean esAlertaRoja = evaluador.evaluarAlertaRoja(20, 2);
        assertFalse(esAlertaRoja, "Debe retornar false cuando la inasistencia sea <= 15%");
    }
}
