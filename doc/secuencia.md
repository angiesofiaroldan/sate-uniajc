# Diagrama de Secuencia - SATE-UNIAJC

Este diagrama modela el intercambio dinámico de mensajes para el registro de asistencia y la evaluación automática de alertas, incluyendo el guardado en la base de datos.

```mermaid
sequenceDiagram
    autonumber
    actor Docente as Docente / Sistema
    participant Controller as EstudianteController
    participant Repo as EstudianteRepository
    participant Gestor as GestorAlertas
    participant Evaluador as EvaluadorInasistencia
    participant Notificador as ServicioNotificacion
    participant AlertaRepo as AlertaRepository

    Docente->>Controller: registrarAsistencia(idEstudiante, fecha, esPresente)
    Controller->>Repo: buscarEstudiantePorId(idEstudiante)
    Repo-->>Controller: objetoEstudiante
    Controller->>Gestor: procesarEstudiante(objetoEstudiante)
    
    activate Gestor
    Gestor->>Evaluador: evaluarAlertaRoja(totalClases, inasistencias)
    activate Evaluador
    Evaluador-->>Gestor: boolean (true = Alerta Roja)
    deactivate Evaluador
    
    alt Requiere Generar Alerta
        Gestor->>AlertaRepo: guardar(alerta)
        activate AlertaRepo
        AlertaRepo-->>Gestor: alertaGuardada
        deactivate AlertaRepo
        
        Gestor->>Notificador: enviarNotificacion(nuevaAlerta)
        activate Notificador
        Notificador-->>Gestor: exitoNotificacion (true)
        deactivate Notificador
    end
    
    Gestor-->>Controller: listaAlertasGeneradas
    deactivate Gestor
    Controller-->>Docente: Respuesta HTTP 200 (OK + Alertas)
```
