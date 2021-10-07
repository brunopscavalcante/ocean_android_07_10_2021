package com.oceanbrasil.ocean_android_introducao_07_10_2021

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

        btEnviar.setOnClickListener {
            val personName = editTextTextPersonName.text
            tvResultado.text = personName
        }

        btReset.setOnClickListener {
            editTextTextPersonName.text = resources.getString(R.string.digite_o_seu_nome)
            tvResultado.text = resources.getString(R.string.o_resultado_aparecer_aqui)
        }

        /*
        Exercício: Construir um elemento de EditText no layout (entre o Textview e o Botão)
        Ao clicar no botão, pegar o que foi digitado no EditText e atualizar no text do Textview
         */
    }
}