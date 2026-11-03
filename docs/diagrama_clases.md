# Diagrama de Clases UML - SATE-UNIAJC

Plano técnico del Módulo de Alertas Tempranas (Corte II).

## Principios SOLID aplicados

- **SRP:** `EvaluadorInasistencia` solo calcula las reglas de negocio; `ServicioNotificacion` solo envía notificaciones; `GestorAlertas` solo coordina el flujo.
- **DIP:** `GestorAlertas` depende de las interfaces `IEvaluadorInasistencia` e `INotificador`, no de clases concretas. Las dependencias se inyectan por constructor.

```mermaid
classDiagram
    Estudiante "1" -- "1..*" RegistroAsistencia : registra
    Estudiante "1" -- "0..*" Alerta : posee
    Docente "1" -- "1..*" Asignatura : dicta
    Asignatura "1" -- "1..*" RegistroAsistencia : contiene

    GestorAlertas ..> IEvaluadorInasistencia : depende de
    GestorAlertas ..> INotificador : depende de
    GestorAlertas ..> Alerta : crea
    EvaluadorInasistencia ..|> IEvaluadorInasistencia : implementa
    ServicioNotificacion ..|> INotificador : implementa

    class IEvaluadorInasistencia {
        <<interface>>
        +evaluarAlertaRoja(int totalClases, int inasistencias) boolean
        +evaluarAlertaAmarilla(double promedio) boolean
    }
    class INotificador {
        <<interface>>
        +enviarNotificacion(Alerta alerta) boolean
    }
    class EvaluadorInasistencia {
        +evaluarAlertaRoja(int totalClases, int inasistencias) boolean
        +evaluarAlertaAmarilla(double promedio) boolean
    }
    class ServicioNotificacion {
        +enviarNotificacion(Alerta alerta) boolean
    }
    class GestorAlertas {
        -IEvaluadorInasistencia evaluador
        -INotificador notificador
        +GestorAlertas(IEvaluadorInasistencia evaluador, INotificador notificador)
        +procesarEstudiante(Estudiante estudiante) List~Alerta~
    }
    class Estudiante {
        -Long idEstudiante
        -String codigo
        -String nombre
        -double promedioAcumulado
        +getPromedioAcumulado() double
        +getCodigo() String
    }
    class Docente {
        -Long idDocente
        -String nombre
        -String correoInstitucional
        +getCorreoInstitucional() String
    }
    class Asignatura {
        -Long idAsignatura
        -String codigoMateria
        -int totalClasesProgramadas
        +getTotalClasesProgramadas() int
    }
    class RegistroAsistencia {
        -Long idRegistro
        -LocalDate fechaClase
        -boolean esPresente
        +esPresente() boolean
    }
    class Alerta {
        -Long idAlerta
        -String tipoAlerta
        -LocalDateTime fechaGeneracion
        +getTipoAlerta() String
    }
```
