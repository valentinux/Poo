package com.example.poo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.poo.classes.Phone

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
        println("The calling number is: " + phone.number)
    }
}