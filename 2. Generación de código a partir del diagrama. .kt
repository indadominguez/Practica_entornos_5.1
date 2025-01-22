
class Curso(private val nombre: String, private val codigo: String){

    private var estudiantes: MutableList<Estudiante> = mutableListOf()


    fun agregarEstudiante(alumno: Estudiante){

        estudiantes.add(alumno)
    }

    fun mostrarEstudiantes(){

        println("El curso $nombre, de código $codigo cuenta con los estudiantes: ")

        for (estudiante in estudiantes){
            println("El estudiante ${estudiante.nombre} con dni ${estudiante.dni} pertenecese a este curso")
        }

    }
}


class Estudiante(val nombre: String, val dni: String){

    fun inscribirseCurso(curso: Curso){

        println("El estudiante $nombre ha sido inscrito en el curso")
        curso.agregarEstudiante(this)

    }
}


fun main(){

    val estudiante1 = Estudiante("Ezequiel", "32456721w")

    val estudiante2 = Estudiante("Ángel", "77367824b")


    val curso = Curso("Entornos", "24835")


    curso.agregarEstudiante(estudiante1)
    curso.agregarEstudiante(estudiante2)
    estudiante3.inscribirseCurso(curso)

    println(curso.mostrarEstudiantes())

}

