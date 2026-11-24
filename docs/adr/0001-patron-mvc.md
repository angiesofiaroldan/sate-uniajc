 ADR-0001: Adopción del Patrón Model-View-Controller (MVC)

 Estado
Propuesto

 Contexto y Problema
En el Corte II, la lógica del Motor de Alertas y la gestión de datos se encontraban concentradas en clases de servicio sin una separación formal de la capa de presentación. Se requiere una arquitectura modular que permita escalar la interfaz de usuario sin alterar la lógica del negocio ni las reglas de evaluación.

 Opciones Consideradas
1. Mantener la estructura monolítica en servicios sin capa de controlador formal.
2. Implementar la arquitectura MVC separando /model, /view y /controller.

 Decisión Elegida
Opción 2: Adopción formal del patrón MVC. Esta decisión independiza la interfaz gráfica, facilita la reutilización del modelo y permite realizar pruebas unitarias sobre el controlador y los servicios.

 Consecuencias
- Positivas: Mantenibilidad incrementada, separación clara de responsabilidades (SRP), alta testabilidad con JUnit 5.
- Negativas: Mayor cantidad de paquetes y archivos en la estructura del proyecto.
