package com.example.kotlinclasesyherenciaejercicios

import java.util.Scanner

class RegistroEstudiantes (var nombre: String, var edad: Int, var calificaciones: Int) {
    constructor(): this("Javier",20,8)

    override fun toString(): String {
        return "Nombre: ${nombre}, Edad: ${edad}, Calificación: ${calificaciones}"
    }
}
fun main() {
    var estudiantes = mutableListOf<RegistroEstudiantes>()
    var sc = Scanner(System.`in`)

    while (true) {
        println("Seleccione una opción:")
        println("1. Agregar un estudiante")
        println("2. Mostrar información de un estudiante")
        println("3. Calcular el promedio de calificaciones")
        println("4. Salir")

        val opcion = sc.nextInt()

        when (opcion) {
            1 -> {
                println("Ingrese el nombre del estudiante:")
                val nombre = sc.next()

                println("Ingrese la edad del estudiante:")
                val edad = sc.nextInt()

                println("Ingrese la calificación del estudiante:")
                val calificacion = sc.nextInt()

                val estudiante = RegistroEstudiantes(nombre, edad, calificacion)
                estudiantes.add(estudiante)
            }

            2 -> {
                println("Ingrese el nombre del estudiante que desea mostrar:")
                val nombre = sc.next()

                val estudiante = estudiantes.find { it.nombre == nombre }

                if (estudiante != null) {
                    println("Nombre: ${estudiante.nombre}")
                    println("Edad: ${estudiante.edad}")
                    println("Calificación: ${estudiante.calificaciones}")
                } else {
                    println("No se encontró el estudiante.")
                }
            }

            3 -> {

            }

            4 -> {
                println("Saliendo...")
                break
            }

            else -> {
                println("Opción no válida.")
            }
        }
    }
}