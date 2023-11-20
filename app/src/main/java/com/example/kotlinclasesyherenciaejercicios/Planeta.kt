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
class SistemaSolar(val planetas: MutableList<Planeta>){
    fun planetaMayor(): Planeta? {
        return planetas.maxByOrNull { it.masa }
    }

    fun planetaMenor(): Planeta? {
        return  planetas.minByOrNull { it.masa }
    }

    fun masaMedia(): Double {
        return planetas.sumOf { it.masa } / planetas.size
    }


}
fun main(){
    val sistemaSolar = SistemaSolar(mutableListOf(
        Planeta("Mercurio", "Rocoso", 3.302e23),
        Planeta("Venus", "Rocoso", 4.867e24),
        Planeta("Tierra", "Rocoso", 5.976e24),
        Planeta("Marte", "Rocoso", 6.417e23),
        Planeta("Jupiter", "Gaseoso", 1.898e27),
        Planeta("Saturno", "Gaseoso", 5.685e26),
        Planeta("Urano", "Gaseoso", 8.683e25),
        Planeta("Neptuno", "Gaseoso", 1.024e26)
    ))

    println("Planeta de mayor masa: ${sistemaSolar.planetaMayor()}")
    println("Planeta de menor masa: ${sistemaSolar.planetaMenor()}")
    println("Masa media de los planetas: ${sistemaSolar.masaMedia()}")

    println(".................................................")
    println(".................................................")
    println("Lista de planetas: ")
    for(p in sistemaSolar.planetas){
        println(p)
    }

    val planetasM = sistemaSolar.planetas.filter { it.nombre.startsWith("M") }
    println(".................................................")
    println(".................................................")
    println("Planetas que empiecen por 'M': ")
    planetasM.forEach { println(it) }


}