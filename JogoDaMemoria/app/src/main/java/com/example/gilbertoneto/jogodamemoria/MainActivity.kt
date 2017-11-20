package com.example.gilbertoneto.jogodamemoria

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.gilbertoneto.jogodamemoria.R.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var ivImg1:ImageView
    lateinit var ivImg2:ImageView
    lateinit var ivImg3:ImageView
    lateinit var ivImg4:ImageView
    lateinit var ivImg5:ImageView
    lateinit var ivImg6:ImageView
    lateinit var tvTentativa:TextView
    lateinit var btTentar:Button



    lateinit var ivSelecao1:ImageView
    lateinit var ivSelecao2:ImageView


    var listaImg = arrayListOf<Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        this.ivImg1 = findViewById(R.id.tvMemoriaImg1)
        this.ivImg2 = findViewById(R.id.tvMemoriaImg2)
        this.ivImg3 = findViewById(R.id.tvMemoriaImg3)
        this.ivImg4 = findViewById(R.id.tvMemoriaImg4)
        this.ivImg5 = findViewById(R.id.tvMemoriaImg5)
        this.ivImg6 = findViewById(R.id.tvMemoriaImg6)
        this.tvTentativa = findViewById(R.id.tvTentativa)
        this.btTentar = findViewById(R.id.btMainTentar)

        ivImg1.setOnClickListener({verificaTime(it)})

        btTentar.setOnClickListener({tentarNovamente()})
//        ivImg2.setOnClickListener({verificaTime(it)})
//        ivImg3.setOnClickListener({verificaTime(it)})
//        ivImg4.setOnClickListener({verificaTime(it)})
//        ivImg5.setOnClickListener({verificaTime(it)})
//        ivImg6.setOnClickListener({verificaTime(it)})


    }

    fun verificaTime(view: View) {

        if (view.id == tvMemoriaImg1.id) {
            if(listaImg.size < 2 )
                if(listaImg.size == 0){
                    ivImg1.setImageResource(R.drawable.palmeiras)
                    listaImg.add(R.drawable.palmeiras)
                    ivImg1.isClickable = false
                } else if (listaImg.size == 1 && listaImg.contains(R.drawable.palmeiras)){
                    ivImg1.setImageResource(R.drawable.palmeiras)
                    Thread.sleep(500)
                    val it = Intent(this, TelaResultado::class.java)
                    it.putExtra("RESULTADO", "Você acertou!")
                    startActivity(it)
                    finish()
                } else {
                    ivImg1.setImageResource(R.drawable.palmeiras)
                    tvTentativa.text = "Tente novamente"
                    listaImg.clear()
                    bloqueiaClick()

                }



        } else if (view.id == tvMemoriaImg2.id) {

            if(listaImg.size < 2 )
                if(listaImg.size == 0){
                    ivImg2.setImageResource(R.drawable.botafogo)
                    listaImg.add(R.drawable.botafogo)
                    ivImg2.isClickable = false
                } else if (listaImg.size == 1 && listaImg.contains(R.drawable.botafogo)){
                    ivImg2.setImageResource(R.drawable.botafogo)
                    Thread.sleep(500)
                    val it = Intent(this, TelaResultado::class.java)
                    it.putExtra("RESULTADO", "Você acertou!")
                    startActivity(it)
                    finish()
                } else {
                    ivImg2.setImageResource(R.drawable.botafogo)
                    tvTentativa.text = "Tente novamente"
                    listaImg.clear()
                    bloqueiaClick()

                }
        }

        else if (view.id == tvMemoriaImg3.id) {

            if(listaImg.size < 2 )
                if(listaImg.size == 0){
                    ivImg3.setImageResource(R.drawable.chapecoense)
                    listaImg.add(R.drawable.chapecoense)
                    ivImg3.isClickable = false
                } else if (listaImg.size == 1 && listaImg.contains(R.drawable.chapecoense)){
                    ivImg3.setImageResource(R.drawable.chapecoense)
                    Thread.sleep(500)
                    val it = Intent(this, TelaResultado::class.java)
                    it.putExtra("RESULTADO", "Você acertou!")
                    startActivity(it)
                    finish()
                } else {
                    ivImg3.setImageResource(R.drawable.chapecoense)
                    tvTentativa.text = "Tente novamente"
                    listaImg.clear()
                    bloqueiaClick()

                }
        }

        else if (view.id == tvMemoriaImg4.id) {

            if(listaImg.size < 2 )
                if(listaImg.size == 0){
                    ivImg4.setImageResource(R.drawable.botafogo)
                    listaImg.add(R.drawable.botafogo)
                    ivImg4.isClickable = false
                } else if (listaImg.size == 1 && listaImg.contains(R.drawable.botafogo)){
                    ivImg4.setImageResource(R.drawable.botafogo)
                    Thread.sleep(500)
                    val it = Intent(this, TelaResultado::class.java)
                    it.putExtra("RESULTADO", "Você acertou!")
                    startActivity(it)
                    finish()
                } else {
                    ivImg4.setImageResource(R.drawable.botafogo)
                    tvTentativa.text = "Tente novamente"
                    listaImg.clear()
                    bloqueiaClick()

                }
        }

        else if (view.id == tvMemoriaImg5.id) {

            if(listaImg.size < 2 )
                if(listaImg.size == 0){
                    ivImg5.setImageResource(R.drawable.palmeiras)
                    listaImg.add(R.drawable.palmeiras)
                    ivImg5.isClickable = false
                } else if (listaImg.size == 1 && listaImg.contains(R.drawable.palmeiras)){
                    ivImg5.setImageResource(R.drawable.palmeiras)
                    Thread.sleep(500)
                    val it = Intent(this, TelaResultado::class.java)
                    it.putExtra("RESULTADO", "Você acertou!")
                    startActivity(it)
                    finish()
                } else {
                    ivImg5.setImageResource(R.drawable.palmeiras)
                    tvTentativa.text = "Tente novamente"
                    listaImg.clear()
                    bloqueiaClick()



                }
        }

        else if (view.id == tvMemoriaImg6.id) {

            if(listaImg.size < 2 )
                if(listaImg.size == 0){
                    ivImg6.setImageResource(R.drawable.chapecoense)
                    listaImg.add(R.drawable.chapecoense)
                    ivImg6.isClickable = false
                } else if (listaImg.size == 1 && listaImg.contains(R.drawable.chapecoense)){
                    ivImg6.setImageResource(R.drawable.chapecoense)
                    Thread.sleep(500)
                    val it = Intent(this, TelaResultado::class.java)
                    it.putExtra("RESULTADO", "Você acertou!")
                    startActivity(it)
                    finish()
                } else {
                    ivImg6.setImageResource(R.drawable.chapecoense)
                    tvTentativa.text = "Tente novamente"
                    listaImg.clear()
                    bloqueiaClick()

                }
        }
    }

    fun tentarNovamente(){
        ivImg1.setImageResource(R.drawable.question)
        ivImg2.setImageResource(R.drawable.question)
        ivImg3.setImageResource(R.drawable.question)
        ivImg4.setImageResource(R.drawable.question)
        ivImg5.setImageResource(R.drawable.question)
        ivImg6.setImageResource(R.drawable.question)
        tvTentativa.text = ""

        ivImg1.isClickable = true
        ivImg2.isClickable = true
        ivImg3.isClickable = true
        ivImg4.isClickable = true
        ivImg5.isClickable = true
        ivImg6.isClickable = true
    }

    fun bloqueiaClick (){

        ivImg1.isClickable = false
        ivImg2.isClickable = false
        ivImg3.isClickable = false
        ivImg4.isClickable = false
        ivImg5.isClickable = false
        ivImg6.isClickable = false
    }

}
