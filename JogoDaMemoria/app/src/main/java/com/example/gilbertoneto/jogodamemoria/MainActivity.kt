package com.example.gilbertoneto.jogodamemoria

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var ivTime1:ImageView
    lateinit var ivTime2:ImageView
    lateinit var ivTime3:ImageView
    lateinit var ivTime4:ImageView
    lateinit var ivTime5:ImageView
    lateinit var ivTime6:ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.ivTime1 = findViewById(R.id.tvMainImgBot)
        this.ivTime2 = findViewById(R.id.tvMainImgCha)
        this.ivTime3 = findViewById(R.id.tvMainImgGre)
        this.ivTime4 = findViewById(R.id.tvMainImgVas)
        this.ivTime5 = findViewById(R.id.tvMainImgAlt)
        this.ivTime6 = findViewById(R.id.tvMainImgPal)




    }

    fun chamarTelaMemoria(view: View){


        //Problemas para recuperar valores das imageView - Solicitar ajuda a professora/monitor
    }


}
