package com.example.kotlinclasesyherenciaejercicios

import kotlin.math.PI
import kotlin.math.pow


class Circulo: Circunferencia {
    // Atributo adicional para el color
    private var color: String = ""

    // Constructor primario
    constructor(radio: Double, color: String) : super(radio) {
        this.color = color
    }

    // Constructor secundario
    constructor(centroX: Double, centroY: Double, puntoX: Double, puntoY: Double, color: String) :
            super(centroX, centroY, puntoX, puntoY) {
        this.color = color
    }

    // Método para calcular el área del círculo
    fun área(): Double {
        return PI * radio.pow(2)
    }

    // Sobrecarga del método toString()
    override fun toString(): String {
        return "Círculo: Radio=$radio, Centro=($centroX, $centroY), Color=$color, Área=${área()}"
    }
}
fun main(){
    val círculo1 = Circulo(5.0, "Rojo")
    println(círculo1)

    val círculo2 = Circulo(1.0, 2.0, 4.0, 6.0, "Azul")
    println(círculo2)
}