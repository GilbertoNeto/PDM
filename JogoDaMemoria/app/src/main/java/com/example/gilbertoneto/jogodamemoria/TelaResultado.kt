package com.example.gilbertoneto.jogodamemoria

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.LinearLayout
import android.widget.TextView

class TelaResultado : AppCompatActivity() {

    lateinit var tvResultado:TextView
    lateinit var tvCor:LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_resultado)

        this.tvResultado = findViewById(R.id.tvInformacao)
        this.tvCor = findViewById(R.id.tvCor)

        this.tvResultado.text = intent.getStringExtra("RESULTADO")
        this.tvCor.setBackgroundColor(Color.GREEN)
    }
}
