# Practica_entornos_5.1
# Preguntas sobre el diagrama de clases 

---

1. **Interpreta el significado del diagrama de clases.**

a) **Relación entre las clases. Significado, tipo, multiplicidad.** 

b) **Elementos de las clases. Tipos y propósito.**  

c) **Significado del método agregarAlumno(). Funcionamiento.**  

d) **Significado del método inscribirse()** 

2. **Generación de código a partir del diagrama.**  

a) **Crear clases** 

b) **Crear relaciones** 

c) **Crear main (para probar el sistema).** 

---

## a) Relación entre las clases. Significado, tipo, multiplicidad. 

El diagrama de clases presentado muestra una relación entre dos clases: Curso y Estudiante.

a) La relación de la clase hace referencia a que la clase curso **CONTIENE** a la clase estudiante, es de tipo agregación, ya que se representa con una línea que tiene un rombo en la parte de la clase que es una agregación de la otra clase 

Tipo:
Es una relación de composición (representada por el rombo lleno). La composición significa que los estudiantes están estrechamente ligados al curso, y si el curso deja de existir, los estudiantes relacionados con ese curso no estarían más asociados dentro de este contexto.

Multiplicidad:

En la clase Curso, el extremo de la relación tiene el valor 1, lo que indica que un curso es único en la relación.
En la clase Estudiante, el extremo tiene el valor * (cero o más), lo que indica que un curso puede contener múltiples estudiantes.
En resumen:

Un curso puede tener múltiples estudiantes inscritos (1 -> *).
Cada estudiante pertenece a un curso.
