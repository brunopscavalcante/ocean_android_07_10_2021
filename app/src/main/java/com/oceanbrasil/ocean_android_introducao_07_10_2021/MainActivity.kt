package com.oceanbrasil.ocean_android_introducao_07_10_2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Buscar o botão pelo ID
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val btReset = findViewById<Button>(R.id.btReset)
        val editTextTextPersonName = findViewById<TextView>(R.id.editTextTextPersonName)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val btGoNext = findViewById<Button>(R.id.btGoNext)

        val oldValue_editTextTextPersonName = editTextTextPersonName.text.toString()
        val oldValue_tvResultado = tvResultado.text.toString()

        btEnviar.setOnClickListener {
            tvResultado.text = editTextTextPersonName.text
        }

        btReset.setOnClickListener {
            editTextTextPersonName.text = oldValue_editTextTextPersonName
            tvResultado.text = oldValue_tvResultado
        }

        btGoNext.setOnClickListener {
            val segundaTelaIntent = Intent(this, SecondActivity::class.java)
            startActivity(segundaTelaIntent)
        }

        /*
        Exercício: Construir um elemento de EditText no layout (entre o Textview e o Botão)
        Ao clicar no botão, pegar o que foi digitado no EditText e atualizar no text do Textview
         */
    }
}