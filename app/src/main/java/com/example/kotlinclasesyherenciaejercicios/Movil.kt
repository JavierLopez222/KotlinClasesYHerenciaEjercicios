package com.example.kotlinclasesyherenciaejercicios

import java.time.LocalTime
import java.util.*
class Movil {
    open class Nota(val id: Int, val linea: String) {
        override fun toString(): String {
            return "Nota(id=$id, linea='$linea')"
        }
    }

    class NotaAlarma(val id1: Int, val linea1: String, val horaAlarma: LocalTime) : Nota(id1, linea1) {
        override fun toString(): String {
            return "NotaAlarma(id=$id1, linea='$linea1', horaAlarma=$horaAlarma)"
        }
    }

    class BlocNotas {
        private val notas: MutableList<Nota> = ArrayList()

        fun agregarNota(nota: Nota) {
            notas.add(nota)
        }

        fun listarNotas(): List<Nota> {
            return notas
        }

        fun eliminarNota(posicion: Int) {
            notas.removeAt(posicion)
        }

        fun cantidadNotas(): Int {
            return notas.size
        }
    }
}

fun main() {
    val nota1 = Movil.Nota(1, "Esta es la primera nota")
    val nota2 = Movil.Nota(2, "Esta es la segunda nota")
    println(nota1)
    println(nota2)

    val notaAlarma1 = Movil.NotaAlarma(1, "Esta es la primera nota", LocalTime.of(10, 0))
    val notaAlarma2 = Movil.NotaAlarma(2, "Esta es la segunda nota", LocalTime.of(14, 0))
    println(notaAlarma1)
    println(notaAlarma2)

    val blocNotas = Movil.BlocNotas()
    blocNotas.agregarNota(notaAlarma1)
    blocNotas.agregarNota(notaAlarma2)
    println("Cantidad de notas: ${blocNotas.cantidadNotas()}")
    println("Lista de notas:")
    blocNotas.listarNotas().forEach { println(it) }

    blocNotas.eliminarNota(0)
    println("Lista de notas después de eliminar la primera nota:")
    blocNotas.listarNotas().forEach { println(it) }
}