package com.example.kotlinclasesyherenciaejercicios

import android.view.inputmethod.ExtractedTextRequest

class EquipoFutbol (val nombre: String, val pais: String) {
    constructor(): this("Betis", "España")

    override fun toString(): String {
        return "Equipo: ${nombre}, País: ${pais}"
    }
}

class Liga(val equipos: MutableList<EquipoFutbol>){
    fun championsLeague() {
        val equiposSorteados = equipos.shuffled()

        for (i in 0..7 step 2) {
            println("Octavos de final - Equipo ${equiposSorteados[i].nombre} vs Equipo ${equiposSorteados[i + 1].nombre}")
        }
    }

}


fun main(){
    val liga = Liga(mutableListOf<EquipoFutbol>(
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
        EquipoFutbol("Florentina", "Italia"),
        EquipoFutbol("Bayer Leverkusen", "Alemania"),
        EquipoFutbol("Borussia Dortmund", "Alemania"),
        EquipoFutbol("VfL Bochum 1848", "Alemania"),
        EquipoFutbol("Arsenal", "Inglaterra")
    ))

    println("Todos los equipos: ")
    for(equipo in liga.equipos){
        println(equipo)
    }



}


