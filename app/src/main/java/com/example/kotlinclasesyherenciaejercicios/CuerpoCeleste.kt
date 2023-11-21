package com.example.kotlinclasesyherenciaejercicios

open class CuerpoCeleste (
    var nombre: String,
    var masa: Double,
    var diametroMedio: Double,
    var periodoRotacion: Double,
    var periodoTraslacion: Double,
    var distanciaMedia: Double,
    var excentridad: Double){

    open fun imprimirInformacion(){
        println("Nombre $nombre")
        println("Masa $masa")
        println("Diametro Medio $diametroMedio")
        println("Periodo de Rotación $periodoRotacion")
        println("Periodo de traslación $periodoTraslacion")
        println("Distancia media $distanciaMedia")
        println("Excentridad $excentridad")
    }
}
class Planetaa(
    nombre: String,
    masa: Double,
    diametroMedio: Double,
    periodoRotacion: Double,
    periodoTraslacion: Double,
    distanciaMedia: Double,
    excentridad: Double): CuerpoCeleste(nombre, masa, diametroMedio, periodoRotacion, periodoTraslacion, distanciaMedia, excentridad){

    override fun imprimirInformacion() {
        super.imprimirInformacion()
    }
}
class Satelite(
    nombre: String,
    masa: Double,
    diametroMedio: Double,
    periodoRotacion: Double,
    periodoTraslacion: Double,
    distanciaMedia: Double,
    excentridad: Double): CuerpoCeleste(nombre, masa, diametroMedio, periodoRotacion, periodoTraslacion, distanciaMedia, excentridad){

    override fun imprimirInformacion() {
        super.imprimirInformacion()
    }
}
fun main(){
    val tierra = Planetaa("Tierra", 5.972 * Math.pow(10.0, 24.0), 13000.0, 24.0, 365.0, 13000.0, 0.0167)
    val luna = Satelite("Luna", 7.349 * Math.pow(10.0, 22.0), 3476.0, 27.32, 27.32, 384400.0, 0.044)
    tierra.imprimirInformacion()
    println("............................")
    luna.imprimirInformacion()
}