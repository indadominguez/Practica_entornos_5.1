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

 **a) Relación entre las clases. Significado, tipo, multiplicidad.**

El diagrama de clases presentado muestra una relación entre dos clases: **Curso** y **Estudiante**.

**Significado:**
La relación de la clase hace referencia a que la clase curso **CONTIENE** a la clase estudiantes y cada uno existe por si mismo.

**Tipo:**
Es de tipo agregación, porque se representa con una línea que tiene un rombo en la parte de la clase que es una agregación de la otra clase, 
por lo que el curso contiene a los estudiantes pero estos, no dependen exclusivamente de curso para poder existir.

**Multiplicidad:**
En la clase Curso, el extremo de la relación tiene el valor 1, lo que indica que un curso es único en la relación.
En la clase Estudiante, el extremo tiene el valor * (cero o más), lo que indica que un curso puede contener múltiples estudiantes.
Un curso puede tener muchos estudiantes inscritos y cada estudiante pertenece a un curso.
