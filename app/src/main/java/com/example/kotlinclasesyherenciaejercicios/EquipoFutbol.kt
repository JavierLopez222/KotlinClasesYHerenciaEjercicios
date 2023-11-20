package com.example.kotlinclasesyherenciaejercicios

import android.view.inputmethod.ExtractedTextRequest

class EquipoFutbol (val nombre: String, val pais: String) {
    constructor(): this("Betis", "España")

    override fun toString(): String {
        return "Equipo: ${nombre}, País: ${pais}"
    }
}

class Liga(val equipos: MutableList<EquipoFutbol>){

}

fun main(){
    val equipos = Liga(mutableListOf<EquipoFutbol>(
        EquipoFutbol("Real Madrid", "España"),
        EquipoFutbol("Barcelona","España"),
        EquipoFutbol("Betis","España"),
        EquipoFutbol("Granada","España"),
        EquipoFutbol("Manchester United", "Inglaterra"),
        EquipoFutbol("Bayern Múnich", "Alemania"),
        EquipoFutbol("Liverpool FC","Inglaterra"),
        EquipoFutbol("Juventus","Italia"),
        EquipoFutbol("PSG","Francia"),
        EquipoFutbol("Chelsea", "Inglaterra"),
        EquipoFutbol("Roma","Italia"),
        EquipoFutbol("Florentina", "Italia")
    ))

    println("Todos los equipos: ${equipos.equipos}")
}