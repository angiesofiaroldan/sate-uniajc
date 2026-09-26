# Proyecto Integrador: SATE-UNIAJC 🚀
## Módulo: Autenticación y Acceso Seguro (Sprint 1)

Este repositorio contiene el incremento funcional del Sprint 1 para el sistema SATE-UNIAJC. El objetivo es proporcionar un control de acceso seguro y asignación de roles para la comunidad universitaria.

### 📋 Sprint Goal
"Implementar un módulo funcional y seguro de autenticación y gestión de usuarios para que docentes, estudiantes y directores puedan ingresar a SATE-UNIAJC con validación de credenciales."

---

### 🛡️ Calidad del Producto (ISO/IEC 25010)
Aplicamos los siguientes pilares de la norma de calidad en este incremento:
*   **Seguridad:** Contraseñas encriptadas mediante la función hash `bcrypt`. Sesiones protegidas con tokens `JWT` con expiración automática de tiempo.
*   **Usabilidad:** Interfaz responsive (móvil/web) adaptada con validaciones en tiempo real y mensajes de error descriptivos (ej. "Credenciales incorrectas").
*   **Mantenibilidad:** Arquitectura limpia separada por capas bien definidas (Controladores, Servicios y Repositorios) para facilitar la escalabilidad en el Sprint 2.

---

### ✅ Definition of Done (DoD) - Lista de Verificación
- [x] Código fuente integrado en la rama `main` sin conflictos ni errores de compilación.
- [x] Formulario de Login funcional con flujos validados (exitosos y fallidos).
- [x] Criterios de Aceptación (Given-When-Then) validados mediante pruebas.
- [x] Documentación técnica básica actualizada en este archivo README.md.

---

### ⛵ Retrospectiva del Sprint 1 (Matriz Sailboat)
*   **Viento (Impulsores):** Buena comunicación por canales del equipo y agilidad en el despliegue del contenedor de la base de datos.
*   **Anclas (Frenos):** Bloqueos temporales al conectar el Frontend con la API debido a políticas de CORS.
*   **Rocas (Riesgos):** Posible falta de tiempo en el Sprint 2 debido a la complejidad de las reglas de negocio del Motor de Alertas.
*   **Plan de Acción:**
    1. Realizar Dailies de 10 minutos a las 8:00 PM vía Discord.
    2. Definir contratos de API antes de iniciar el desarrollo visual de las vistas.
