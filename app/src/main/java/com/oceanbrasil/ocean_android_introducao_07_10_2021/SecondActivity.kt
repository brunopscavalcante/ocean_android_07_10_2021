package com.oceanbrasil.ocean_android_introducao_07_10_2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btVoltar = findViewById<Button>(R.id.btVoltar)

        btVoltar.setOnClickListener {
            val mainTelaIntent = Intent(this, MainActivity::class.java)
            mainTelaIntent.putExtra("EXTRA_INFO", "Estava na sexta")
            startActivity(mainTelaIntent)
        }

        /*
        Exercício da semana:
            - Revisitar o design das telas e renomear botões, strings, etc
            - Adicionar um EditText na segunda tela
            - Enviar o valor dele para a Terceira
            - Exibir o valor dele no TextView da Terceira tela! =)
            -
         */
    }
}