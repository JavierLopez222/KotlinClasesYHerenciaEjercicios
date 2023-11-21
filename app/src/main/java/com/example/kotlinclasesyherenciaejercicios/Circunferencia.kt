package com.example.kotlinclasesyherenciaejercicios

import kotlin.math.PI
import kotlin.math.hypot
import kotlin.math.sqrt

open class Circunferencia {
    // Atributos
     var radio: Double = 0.0
     var centroX: Double = 0.0
     var centroY: Double = 0.0

    // Constructor primario
    constructor(radio: Double) {
        this.radio = radio
    }

    // Constructor secundario
    constructor(centroX: Double, centroY: Double, puntoX: Double, puntoY: Double) {
        this.centroX = centroX
        this.centroY = centroY
        this.radio = calcularDistancia(centroX, centroY, puntoX, puntoY)
    }

    // Método para calcular la distancia entre dos puntos
    private fun calcularDistancia(x1: Double, y1: Double, x2: Double, y2: Double): Double {
        return hypot(x2 - x1, y2 - y1)
    }

    // Método para calcular la longitud de la circunferencia
    fun longitud(): Double {
        return 2 * PI * radio
    }

    // Sobrecarga del método toString()
    override fun toString(): String {
        return "Circunferencia: Radio=$radio, Centro=($centroX, $centroY), Longitud=${longitud()}"
    }
}

fun main(){
    val circunferencia1 = Circunferencia(5.0)
    println(circunferencia1)

    val circunferencia2 = Circunferencia(1.0, 2.0, 4.0, 6.0)
    println(circunferencia2)
}