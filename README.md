# Practica_entornos_5.1
# Preguntas sobre el diagrama de clases 



1. **Interpreta el significado del diagrama de clases.**

a) **Relación entre las clases. Significado, tipo, multiplicidad.** 

b) **Elementos de las clases. Tipos y propósito.**  

c) **Significado del método agregarAlumno(). Funcionamiento.**  

d) **Significado del método inscribirse()** 

2. **Generación de código a partir del diagrama.**  

a) **Crear clases** 

b) **Crear relaciones** 

c) **Crear main (para probar el sistema).** 

a) **Relación entre las clases. Significado, tipo, multiplicidad.** 

El diagrama de clases presentado muestra una relación entre dos clases: Curso y Estudiante. Aquí está la interpretación:

a) Relación entre las clases:
Relación: Contiene
Significado:
Un Curso contiene a uno o más Estudiantes. Esto indica que un curso puede tener múltiples estudiantes inscritos, y un estudiante puede estar inscrito en un curso.

Tipo:
Es una relación de composición (representada por el rombo lleno). La composición significa que los estudiantes están estrechamente ligados al curso, y si el curso deja de existir, los estudiantes relacionados con ese curso no estarían más asociados dentro de este contexto.

Multiplicidad:

En la clase Curso, el extremo de la relación tiene el valor 1, lo que indica que un curso es único en la relación.
En la clase Estudiante, el extremo tiene el valor * (cero o más), lo que indica que un curso puede contener múltiples estudiantes.
En resumen:

Un curso puede tener múltiples estudiantes inscritos (1 -> *).
Cada estudiante pertenece a un curso.
