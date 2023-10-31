package com.example.kotlinclasesyherenciaejercicios

class Planeta(var nombre: String, var tipo: String, var masa: Double) {
    constructor(): this("Tierra","Agua",678769.76)
    //fun imprimirPlaneta(){
    //  println("Planeta $planeta")
    //}

    override fun toString(): String {
        return "Planeta(nombre='$nombre', tipo='$tipo', masa='$masa'"
    }
}
fun main(){
    var planeta1 = Planeta()
    println(planeta1)
}