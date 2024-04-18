package com.example.refaccionaria

import android.app.Activity
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var usernameInput : EditText
    lateinit var passwordInput : EditText
    lateinit var loginBtn : Button
    lateinit var  createAccount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        alerta(this)
        sendRegister(this)
    }
    fun alerta(context: Activity){
        loginBtn = findViewById(R.id.login_btn)
        loginBtn.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()
            val builder = AlertDialog.Builder(context)

            builder.setTitle("TU USUARIO ES: $username")
            builder.setMessage("Y TU CONTRA ES: $password")
                .setPositiveButton("ACEPTAR", DialogInterface.OnClickListener{ dialog, id ->
                    val intent: Intent = Intent(this, Home:: class.java)
                    startActivity(intent)
                })
            builder.setNegativeButton("CANCELAR"){
                dialog, id ->
            }
            builder.show()
        }
    }

    fun sendRegister(context: Activity){
        createAccount = findViewById(R.id.createAccount)
        createAccount.setOnClickListener{
            val intento = Intent(this, Registro::class.java)
            startActivity(intento)
        }
    }


    fun prueba(view: View) {
        val username = usernameInput.text.toString()
        val password = passwordInput.text.toString()
        val builder = AlertDialog.Builder(this)

        builder.setTitle("TU USUARIO ES: $username")
        builder.setMessage("Y TU CONTRA ES: $password")
            .setPositiveButton("ACEPTAR", DialogInterface.OnClickListener{ dialog, id ->
                val intent: Intent = Intent(this, Home:: class.java)
                startActivity(intent)
            })
        builder.setNegativeButton("CANCELAR"){
                dialog, id ->
        }
        builder.show()
    }

}