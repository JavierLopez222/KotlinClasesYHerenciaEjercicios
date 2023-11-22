package com.example.kotlinclasesyherenciaejercicios

open class PNJ (var nombre: String, var PV: Int, var PM: Int, var LVL: Int){
    open fun levelUp(){

    }
}

class Guerrero(nombre: String, PV: Int, PM: Int, LVL: Int): PNJ(nombre, PV, PM, LVL){
    override fun levelUp(){
        LVL++
        PV += PV * (8 / 100)
        PM += PM * (1 / 100)
    }
}

class Mago(nombre: String, PV: Int, PM: Int, LVL: Int): PNJ(nombre, PV, PM, LVL){
    override fun levelUp(){
        LVL++
        PV += PV * (4 / 100)
        PM += PM * (3 / 100)
    }
}
fun main(){
    var guerrero = Guerrero("Guerrero", 400, 50, 1)
    var mago = Mago("Mago", 1600, 150, 1)

    while (guerrero.PV <= mago.PV) {
        guerrero.levelUp()
        mago.levelUp()
    }

    println("El guerrero tiene más PV que el mago en el nivel ${guerrero.LVL}")
}