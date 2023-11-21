package com.example.kotlinclasesyherenciaejercicios

class Matematicas {
    fun suma(a: Int, b: Int): Int {
        return a + b
    }

    fun resta(a: Int, b: Int): Int {
        return a - b
    }

    fun multiplicacion(a: Int, b: Int): Int {
        return a * b
    }

    fun division(a: Int, b: Int): Double {
        if (b == 0) {
            throw IllegalArgumentException("El divisor no puede ser 0")
        }
        return a.toDouble() / b
    }
}
fun main(){
    val matematicas = Matematicas()
    println("Suma: ${matematicas.suma(5, 3)}")
    println("Resta: ${matematicas.resta(5, 3)}")
    println("Multiplicación: ${matematicas.multiplicacion(5, 3)}")
    println("División: ${matematicas.division(5, 3)}")
}