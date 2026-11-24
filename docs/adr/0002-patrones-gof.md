 ADR-0002: Implementación de los Patrones Repository y Factory

 Estado
Propuesto

 Contexto y Problema
El acceso a los datos de los estudiantes y la instanciación directa de distintos tipos de alertas (Amarilla vs. Roja) en la capa de servicios generaba acoplamiento fuerte y violaba el principio Open/Closed (OCP).

 Opciones Consideradas
1. Instanciar directamente las clases concretas con 'new' dentro de la lógica del servicio.
2. Aplicar los patrones GoF Repository (para desacoplar persistencia) y Factory (para encapsular la creación de objetos Alerta).

 Decisión Elegida
Opción 2: Implementación de EstudianteRepository y AlertaFactory.

 Consecuencias
- Positivas: Facilita la creación de Mocks para pruebas unitarias TDD y permite agregar nuevos tipos de alertas sin modificar el código del EvaluadorInasistencia.
- Negativas: Ligera complejidad inicial en el diseño de interfaces.
