package com.proitc.kotlin

data class EstudianteKotlin(val nombre: String,
                            val puntaje: Int? = null)

fun main() {
  //val estudiantes2:ArrayList<EstudianteKotlin>
  val estudiantes = listOf(EstudianteKotlin("Julia"),
      EstudianteKotlin("Marco", puntaje = 12),
      EstudianteKotlin(puntaje = 11, nombre = "Pedro"))
  //estudiantes.get(0)
  //val estudianteP = EstudianteKotlin("Prueba")

  val mayorPuntaje = estudiantes.maxBy { it.puntaje ?: 0 }

  println("""El mayor puntaje en Kotlin es de:
    $mayorPuntaje""")
  //println("El mayor puntaje en Kotlin es de: ${mayorPuntaje?.nombre}")
}