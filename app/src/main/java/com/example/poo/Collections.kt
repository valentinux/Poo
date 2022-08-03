package com.example.poo

fun main(){
    val frutaList = listOf("Manzana", "Pera", "Banana", "Uva")
    println(frutaList)
    println(frutaList.get((0..frutaList.size-1).random()))

    println("Indice de Pera: ${frutaList.indexOf("Pera") + 1}" )
}