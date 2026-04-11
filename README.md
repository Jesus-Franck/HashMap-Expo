# 📚 Taller Práctico: Estructuras de Datos - HashMap

Este repositorio contiene el material de apoyo y los ejercicios prácticos diseñados para la exposición sobre la clase **`HashMap`** en Java. El objetivo de esta sesión es que los estudiantes comprendan el funcionamiento de las tablas de hash y practiquen la implementación de lógica basada en pares clave-valor (Key-Value).

---

## 🧠 ¿Qué aprenderemos?

Un **HashMap** es una estructura que almacena información en pares de **clave-valor**, similar a un diccionario. Su principal ventaja es la **búsqueda ultra rápida**, ya que accede a los datos de forma casi instantánea sin necesidad de recorrer toda la lista.

### ⚙️ Funcionamiento Interno

La velocidad del HashMap se basa en la **Función Hash**:

1. **Entrada:** Recibe una clave única.
2. **Procesamiento:** Aplica el método `hashCode()` para convertir la clave en un número entero.
3. **Ubicación:** Ese número determina el índice exacto en un arreglo interno para guardar el valor.

### ⚠️ Reglas de Oro (Características)

* **Claves Únicas:** No se pueden repetir; si se usa una clave existente, el valor se sobrescribe.
* **Valores Duplicados:** Los valores sí pueden repetirse.
* **Gestión de Nulls:** Permite una clave `null` y múltiples valores `null`.
* **Sin Orden:** No garantiza que los elementos mantengan el orden de inserción.
* **No Sincronizado:** No es seguro para hilos (multithreading) por defecto.

---

## 👥 Autores

* **Jesus David Franco Guerra**
* **William Camilo Blanco Nerio**
* **Brayan Camilo Mosquera Hernández**
* **Yorbis David Fernandez Blanco**

---

### 🛠️ Tecnologías y Herramientas

* **Lenguaje:** Java 17 o superior.
* **Gestor de Dependencias:** Maven.
* **Compatibilidad:** Totalmente compatible con IntelliJ IDEA, VS Code y NetBeans.

---

## 🏗️ Niveles del Taller

El taller está organizado para escalar en complejidad:

1. **Operaciones Básicas:** Inserción (`put`) y búsqueda (`get`) de datos.
2. **Iteración:** Recorrido de mapas mediante `keySet` y `entrySet`.
3. **Lógica Personalizada:** Uso de objetos como llaves y manejo de casos donde la llave no existe.

---

## 📂 Estructura del Proyecto

Para facilitar la navegación por los ejercicios de la exposición, el proyecto está organizado de la siguiente manera:

```text
/src
├── 📂 ArrayList/          (Comparativa vs HashMap)
├── 📂 Ejercisios/         (Casos de Estudio: Implementación de Lógica Indexada)
└── 📂 TDS-Collab/         (Espacio para aportes de otros grupos)
