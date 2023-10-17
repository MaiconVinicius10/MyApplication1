package com.example.meuprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
        // aprindo classe view
        fun sortear(view: View){
         val resultado = findViewById<TextView>(R.id.text_Resultado)//find encontrar
         val numero= Random().nextInt(100)//random sortear
            resultado.setText("Numero sorteado é: $numero") //

        }

}