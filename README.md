# Practica_entornos_5.1
# Preguntas sobre el diagrama de clases 

---

1. **Interpreta el significado del diagrama de clases.**

   a) **Relación entre las clases. Significado, tipo, multiplicidad.** 

   b) **Elementos de las clases. Tipos y propósito.**  

   c) **Significado del método agregarAlumno() y Funcionamiento.**  

   d) **Significado del método inscribirse().** 

2. **Generación de código a partir del diagrama.**  

   a) **Crear clases.** 

   b) **Crear relaciones.** 

   c) **Crear main (para probar el sistema).** 

---

## 1. Interpreta el significado del diagrama de clases

 a) **Relación entre las clases. Significado, tipo, multiplicidad.**

   El diagrama de clases presentado muestra una relación entre dos clases: **Curso** y **Estudiante**.

**Significado:**
   La relación de la clase hace referencia a que la clase curso **CONTIENE** a la clase estudiantes y cada uno existe por si mismo.

**Tipo:**
   Es de tipo agregación, porque se representa con una línea que tiene un rombo en la parte de la clase que es una agregación de la otra clase, 
   por lo que el curso contiene a los estudiantes pero estos, no dependen exclusivamente de curso para poder existir.

**Multiplicidad:**
- En la clase Curso, el extremo de la relación tiene el valor 1, lo que indica que un curso es único en la relación.
- En la clase Estudiante, el extremo tiene el valor * (cero o más), lo que indica que un curso puede contener múltiples estudiantes.
- Un curso puede tener muchos estudiantes inscritos y cada estudiante pertenece a un curso.

---

 b) **Elementos de las clases. Tipos y propósito.**  

- En la clase **Curso**, nos encontramos con los elementos **nombre, código, estudiantes, agregarAlumno y mostrarEstudiantes.**

**Atributos:**

**Tipo:** y **Propósito:**
- Nombre: String, Identificar el curso.
- Código: String, Tener una clave única para el código.
- Estudiantes: MutableList, Contiene todos los estudiantes que se inscriben al curso.

**Métodos:**
- agregarAlumno: Nos permite introducir a los estudiantes dentro del curso.
- mostrarEstudiantes: Muestra la lista de los estudiantes ya registrados en el curso.

---
- En la clase **Estudiante**, nos encontramos con los elementos **nombre, DNI e inscribirse.**

**Atributos:**

**Tipo:** y **Propósito:**
- Nombre: String, Representa el nombre del estudiante.
- DNI: String, Es el identificador único de cada estudiante.

**Métodos:**
- Inscribirse: Permite al estudiante poder inscribirse en el curso.

---

c) **Significado del método agregarAlumno() y Funcionamiento.**  

**Significado:**
El método agregarAlumno pertenece a la clase Curso y está diseñado para añadir un objeto de tipo Estudiante a la lista de estudiantes que forman parte del curso. 
Este método permite que un estudiante quede asociado a un curso específico.

**Funcionamiento:**
- El método recibe como parámetro un objeto de la clase Estudiante, que representa al estudiante que será inscrito en el curso.
- Dentro del método, el objeto Estudiante que se pasa como argumento es agregado a la lista estudiantes de la clase Curso.
- Después de ejecutar el método, el estudiante se registra como parte de los estudiantes asociados al curso.
El curso "contendrá" a ese estudiante en su lista interna 


