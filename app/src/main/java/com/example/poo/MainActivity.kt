package com.example.poo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.poo.classes.Group
import com.example.poo.classes.Phone
import com.example.poo.classes.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main()
    }

    val phone = Phone(942884132)

    fun main(){
        phone.call()
        phone.shownumber()
        println("The calling number is: " + phone.getnumber())

        //instance of the class Smartphone
        val smartphone = Smartphone(541203016, true)

        smartphone.call()
        smartphone.shownumber()

        val myUser = User( 1,"Alain", "Nicolás", Group.WORK.ordinal)

        println(myUser.component2())
        println(myUser)


    }
}