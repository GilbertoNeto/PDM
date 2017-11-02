package com.example.gilbertoneto.arrochagame

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.LinearLayout
import android.widget.TextView


class ResultadoActivity : AppCompatActivity() {

    lateinit var tvRes: TextView
    lateinit var layoutRes: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        this.layoutRes = findViewById(R.id.layoutResultado)
        this.tvRes = findViewById(R.id.tvResultado)

        this.tvRes.text = intent.getStringExtra("RESULTADO")

        if(tvRes.text == "Você perdeu!")
        this.layoutRes.setBackgroundColor(Color.RED)
            else {
            this.layoutRes.setBackgroundColor(Color.GREEN)
        }


    }


}
