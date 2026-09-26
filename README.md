<p align="center">
  <img src="https://githubusercontent.com" alt="SATE-UNIAJC Logo" width="300">
</p>

# Proyecto Integrador: SATE-UNIAJC 🚀
## Módulo: Autenticación y Acceso Seguro (Sprint 1)

### 📄 Descripción del Problema e Incremento
Este repositorio contiene el incremento funcional del Sprint 1 enfocado en resolver la falta de un control de accesos centralizado y la gestión de roles en la institución. El objetivo principal es proporcionar un entorno funcional, intuitivo y seguro para que docentes, estudiantes y directores puedan ingresar a SATE-UNIAJC bajo credenciales validadas.

---

### 📋 Sprint Goal (Meta del Sprint)
"Implementar un módulo funcional y seguro de autenticación y gestión de usuarios para que la comunidad universitaria acceda al sistema según sus permisos asignados."

---

### 🌿 Estrategia de Ramas (GitFlow)
Para garantizar la estabilidad del software, el repositorio cuenta con un flujo formal de integración de código:
*   `main`: Rama de producción estable.
*   `develop`: Rama activa de desarrollo y pruebas. Todo el código del incremento pasa primero por esta rama para validación antes de combinarse con producción.

---

### 🛡️ Calidad del Producto (ISO/IEC 25010)
*   **Seguridad:** Contraseñas encriptadas mediante la función hash `bcrypt`. Sesiones protegidas con tokens `JWT` con expiración automática de tiempo.
*   **Usabilidad:** Interfaz responsive (móvil/web) adaptada con validaciones en tiempo real y mensajes de error descriptivos.
*   **Mantenibilidad:** Arquitectura limpia separada por capas bien definidas (Controladores, Servicios y Repositorios).

---

### ✅ Definition of Done (DoD) - Lista de Verificación
- [x] Código fuente integrado en la rama `develop` y probado sin conflictos.
- [x] Formulario de Login funcional con flujos validados (exitosos y fallidos).
- [x] Documentación técnica y archivo `.gitignore` configurados correctamente.
