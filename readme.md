# 🔄 Flujo de Navegación Completo (Back Stack Management)

Este proyecto implementa una navegación profunda entre tres actividades y demuestra cómo gestionar la pila de actividades (Back Stack) para retornar al inicio limpiamente.

## 🚀 Funcionalidades
* **Navegación Lineal:** Paso de `Activity A` -> `Activity B` -> `Activity C`.
* **Limpieza de Pila:** Botón en la última pantalla para volver al inicio borrando el historial intermedio (Flags de Intent).
* **Ciclo de Vida:** Gestión correcta de la creación y destrucción de actividades.

## 📱 Estructura Visual
1.  **Pantalla 1 (Inicio):** Bienvenida y botón para iniciar el flujo.
2.  **Pantalla 2 (Intermedia):** Pantalla de paso con opción de continuar o volver.
3.  **Pantalla 3 (Final):** Contiene el botón clave "Volver al Inicio" que reinicia el flujo.

## 🛠 Conceptos Clave (Android Nativo)
* **Intents Explícitos:** Para movernos entre pantallas.
* **Intent Flags:** Uso de `Intent.FLAG_ACTIVITY_CLEAR_TOP` y `Intent.FLAG_ACTIVITY_NEW_TASK` para manipular el comportamiento de la tecla "Atrás" y la memoria.
* **Context:** Uso de `LocalContext` en Jetpack Compose para lanzar las acciones.

---
*Ejercicio 4 de la Tarea Evaluativa 2 - PMDM*