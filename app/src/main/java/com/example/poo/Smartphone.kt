package com.example.poo

import com.example.poo.classes.Phone

class Smartphone(number: Int, val isPrivate: Boolean): Phone(number) {

    override fun shownumber() {
        if (isPrivate){
            println("Número desconocido")}
            else{
                println(super.shownumber())
        }
    }
}