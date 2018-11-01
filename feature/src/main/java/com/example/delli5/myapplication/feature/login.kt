package com.example.delli5.myapplication.feature

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun Iniciar(view: View){

        val intento=Intent(this,inicio::class.java)
        startActivity(intento)
    }
}
