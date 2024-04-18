package com.example.refaccionaria

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Home : AppCompatActivity() {
    lateinit var salida : TextView
    lateinit var administrar : TextView
    lateinit var revisar : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        sendSalida(this)
        sendRevisar(this)
        sendAdministrar(this)
    }

    fun sendSalida(context: Activity){
        salida = findViewById(R.id.Salida_Stock)
        salida.setOnClickListener {
            val intentS = Intent(this, Salida_Stock::class.java)
            startActivity(intentS)
        }
    }

    fun sendAdministrar(context: Activity){
        administrar = findViewById(R.id.Administrar_Stock)
        administrar.setOnClickListener {
            val intentA = Intent(this, Administrar_Stock::class.java)
            startActivity(intentA)
        }
    }

    fun sendRevisar(context: Activity){
        revisar = findViewById(R.id.Revisar_Stock)
        revisar.setOnClickListener {
            val intentR = Intent(this, Revisar_Stock::class.java)
            startActivity(intentR)
        }
    }
}