package com.example.kotlinclasesyherenciaejercicios

class VideoJuego(var nombre: String, var year: Int, var plataforma: String) {
    constructor(): this("Fifa", 2023, "PS5")

    override fun toString(): String {
        return "Juego: Nombre -N-> ${nombre}, Año -Y-> ${year}, Plataforma -P-> ${plataforma}"
    }


}
fun buscarJuegos(juegos: List<VideoJuego>, year: Int, plataforma: String): List<VideoJuego>{
    return juegos.filter { it.year == year && it.plataforma == plataforma }
}

fun main(){

    val juegos = listOf<VideoJuego>(
        VideoJuego("Final Fantasy VII Rebirth", 2023, "PS5"),
        VideoJuego("Marvel's Wolverine ", 2023, "PS5"),
        VideoJuego("Pragmata", 2023, "PS5"),
        VideoJuego("Dragon Quest 12: The Flames of Fate", 2023, "PS5"),
        VideoJuego("Grand Theft Auto VI ", 2024, "PS5"),
        VideoJuego("Blue Protocol", 2023, "PC"),
        VideoJuego("Star Citizen", 2022, "PC"),
        VideoJuego("Hollow Knight: Silksong", 2023, "PC"),
        VideoJuego("Beyond Good & Evil 2", 2022, "PC")
    )

    println("Todos los juegos:")
    for(juego in juegos){
        println(juego)
    }


    var juegoFiltrado = buscarJuegos(juegos, 2023, "PS5")
    var juegoFiltrado2 = buscarJuegos(juegos, 2022,"PC")

    println(juegoFiltrado)
    println(juegoFiltrado2)
}


