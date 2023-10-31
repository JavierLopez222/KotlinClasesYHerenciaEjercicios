package com.example.kotlinclasesyherenciaejercicios

import kotlin.math.pow

class Triangulo(var lado1: Double, var lado2: Double, var lado3: Double) {
    val perimetro: Double
        get() = lado1 + lado2 + lado3

    //val tipo: String
    //    get() {
    //        if(lado1 == lado2 && lado2 == lado3) {
    //            println("Es un triángulo equilátero")
    //        }else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
    //            println("Es un triángulo isósceles")
    //        }else{
    //            println("Es un triángulo escaleno")
    //        }
    //        return tipo
    //    }

    fun rectangulo(): Boolean{
        val listaLados = listOf<Double>(lado1, lado2, lado3)
        return listaLados[0].pow(2) + listaLados[1].pow(2) == listaLados[2].pow(2)
    }

    constructor(): this(1.5, 1.5, 2.0)

    override fun toString(): String {
        return "Perímetro($perimetro), ¿Es rectángulo?='${rectangulo()}'"
    }
}
fun main(){
    var triangulo1 = Triangulo()

    println(triangulo1)
}