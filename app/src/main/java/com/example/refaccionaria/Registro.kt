package com.example.refaccionaria

import android.app.Activity
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class Registro : AppCompatActivity() {
    lateinit var nombre : TextView
    lateinit var correo : TextView
    lateinit var contra : TextView
    lateinit var crearCuenta : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        alerta(this)
    }

    fun alerta(context: Activity){
        crearCuenta = findViewById(R.id.crearCuenta)
        crearCuenta.setOnClickListener {
            val builder = AlertDialog.Builder(context)
            builder.setTitle("ESTADO DE TU ACCIÓN:")
            builder.setMessage("CUENTA CREADA CON EXITO")
                .setPositiveButton("ACEPTAR", DialogInterface.OnClickListener{ dialog, id ->
                    val intent: Intent = Intent(this, MainActivity:: class.java)
                    startActivity(intent)
                })
            builder.show()
        }
    }
}