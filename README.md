### Descripción
Como usuario del sistema, quiero iniciar sesión con mi correo institucional y contraseña, para acceder a mis funciones según mi rol (Docente, Estudiante, Director).

### Estimación
* **Story Points:** 2 pts

### Criterios de Aceptación
* **Escenario 1: Inicio de sesión exitoso**
  * **Given:** Dado que el docente está en la pantalla de Login y tiene credenciales válidas (@uniajc.edu.co).
  * **When:** Cuando ingresa su usuario y contraseña y presiona 'Ingresar'.
  * **Then:** Entonces el sistema valida los datos y lo redirige a su Dashboard de Asistencia con un token activo.
