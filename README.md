# 📚 Hub de Estructuras de Datos: Java Collections

Este repositorio centraliza el material de apoyo, ejercicios prácticos y soluciones desarrolladas durante las sesiones de exposición y la realización del **Parcial II**. Aquí encontrarás una guía completa sobre cómo gestionar datos de forma eficiente en Java.

---

## 🚀 Contenido Principal: HashMap

El núcleo de nuestra exposición se centra en la clase **`HashMap`**, diseñada para que los estudiantes comprendan el funcionamiento de las tablas de hash y la lógica de pares **clave-valor** (Key-Value).

### 🧠 ¿Qué es un HashMap?

Es una estructura que funciona como un diccionario, permitiendo una **búsqueda ultra rápida** mediante el acceso directo a los datos sin necesidad de recorrer toda la colección.

### ⚙️ Funcionamiento Interno

La magia ocurre a través de la **Función Hash**:

1. **Entrada:** Recibe una clave única.
2. **Procesamiento:** Usa el método `hashCode()` para convertir la clave en un índice entero.
3. **Ubicación:** Determina la posición exacta en la memoria para guardar el valor asociado.

### ⚠️ Reglas de Oro (Características)

* **Claves Únicas:** No se permiten duplicados; si se repite una clave, el valor se sobrescribe.
* **Valores Duplicados:** Los valores pueden repetirse sin problema.
* **Gestión de Nulls:** Permite una clave `null` y múltiples valores `null`.
* **Sin Orden:** No garantiza mantener el orden de inserción (para orden automático, ver sección de **TreeMap**).
* **No Sincronizado:** No es seguro para entornos multihilo sin configuración adicional.

---

## 🛠️ Otras Estructuras Incluidas

Debido a la colaboración del grupo y el contenido del **Parcial II**, este repositorio también incluye ejemplos de:

* **ArrayList:** Gestión dinámica de listas de objetos (ej. Estudiantes).
* **TreeMap:** Mapas que mantienen las claves ordenadas automáticamente.
* **ArrayDeque:** Implementación de colas (Queues) y deques para simulación de filas (atención al cliente).
* **LinkedList:** Listas doblemente enlazadas ideales para inserciones constantes en los extremos.

---

## 👥 Equipo de Trabajo

### **Exposición (Estructuras de Datos)**

* **Jesus David Franco Guerra**
* **William Camilo Blanco Nerio**
* **Brayan Camilo Mosquera Hernández**
* **Yorbis David Fernandez Blanco**

### **Desarrollo del Parcial II**

* **Jesus David Franco Guerra**
* **Brayan Camilo Mosquera Hernández**

---

### 💻 Tecnologías y Herramientas

* **Lenguaje:** Java 17 o superior.
* **Entorno:** Compatible con IntelliJ IDEA, VS Code, NetBeans y Eclipse.

---

Este repositorio es una herramienta de estudio viva. ¡Úsala para dominar las colecciones en Java!
