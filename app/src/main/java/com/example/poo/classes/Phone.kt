package com.example.poo.classes

open class Phone (protected val number: Int) {

    fun call(){
        println("Calling....")
    }

    open fun shownumber(){
        println(number)
    }

    fun getnumber(): Int{
        return number
    }
}