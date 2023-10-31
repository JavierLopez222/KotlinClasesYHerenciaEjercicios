package com.example.kotlinclasesyherenciaejercicios

class Contacto(var nombre: String, var nTelefono: Int, var cElectronico: String) {
    constructor(): this("Javier", 786458934, "javier@gmail.com")

    override fun toString(): String {
        return "Contacto: Nombre= $nombre, Número de teléfono= $nTelefono, Correo electrónico= $cElectronico"
    }
}
fun main(){
    //Creo la lista de contactos
    var listaContacto : MutableList<Contacto> = mutableListOf(
    )

    //Añado tres contactos
    listaContacto.add(Contacto("Pedro",675987563, "pedro@gmail.com"))
    listaContacto.add(Contacto("Juan",783948725, "juan@gmail.com"))
    listaContacto.add(Contacto("Marcos",637894857, "marcos@gmail.com"))

    //Muestro la lista de contactos
    println("Los contactos disponibles son: ")
    for(contacto in listaContacto){
        println(contacto)
    }

    //Eliminar contacto
    if(listaContacto.isNotEmpty()){
        listaContacto.removeAt(0)
    }

    println(" ")
    println("Se ha eliminado el primer contacto de la lista")
    println(" ")

    //Vuelvo a mostrar la lista de contactos
    for(contacto in listaContacto){
        println(contacto)
    }

}