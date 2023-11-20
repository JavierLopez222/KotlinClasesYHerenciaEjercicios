package com.example.kotlinclasesyherenciaejercicios
import java.util.Scanner
class Producto(var nombre: String, var precio: Double, var cantidadEnStock: Int) {
}
fun main(){
    val inventario = mutableListOf<Producto>()
    val scanner = Scanner(System.`in`)

    while (true) {
        println("Seleccione una opción:")
        println("1. Agregar un producto")
        println("2. Actualizar stock de un producto")
        println("3. Mostrar inventario")
        println("4. Salir")

        val opcion = scanner.nextInt()

        when (opcion) {
            1 -> {
                println("Ingrese el nombre del producto:")
                val nombre = scanner.next()

                println("Ingrese el precio del producto:")
                val precio = scanner.nextDouble()

                println("Ingrese la cantidad en stock del producto:")
                val cantidadEnStock = scanner.nextInt()

                val producto = Producto(nombre, precio, cantidadEnStock)
                inventario.add(producto)
            }
            2 -> {
                println("Ingrese el nombre del producto cuyo stock desea actualizar:")
                val nombre = scanner.next()

                val producto = inventario.find { it.nombre == nombre }

                if (producto != null) {
                    println("Ingrese la nueva cantidad en stock del producto:")
                    val nuevaCantidadEnStock = scanner.nextInt()
                    producto.cantidadEnStock = nuevaCantidadEnStock
                } else {
                    println("No se encontró el producto.")
                }
            }
            3 -> {
                println("Inventario:")
                for (producto in inventario) {
                    println("Nombre: ${producto.nombre}")
                    println("Precio: ${producto.precio}")
                    println("Cantidad en stock: ${producto.cantidadEnStock}")
                }
            }
            4 -> {
                println("Saliendo...")
                break
            }
            else -> {
                println("Opción no válida.")
            }
        }
    }
}