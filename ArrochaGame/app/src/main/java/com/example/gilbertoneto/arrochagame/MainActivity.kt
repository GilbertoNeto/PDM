package com.example.gilbertoneto.arrochagame

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var etNumero:EditText
    lateinit var btChute:Button
    lateinit var tvTentativa:TextView
    var numero = 0
    var interval_min = 1
    var interval_max = 100


    var tentativas = 8


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.etNumero = findViewById(R.id.etMainNumero)
        this.btChute = findViewById(R.id.btMainChute)
        this.tvTentativa = findViewById(R.id.tvMainTexto)
        this.numero = this.gerarRandom()


        this.btChute.setOnClickListener({Arrochar(it)})


    }

    fun Arrochar(view: View){

        var num = this.etNumero.text.toString().toInt()
        var perdeu = "Você perdeu!"

        if (num == numero || num <= interval_min || num >= interval_max){
            val it = Intent(this, ResultadoActivity::class.java)
            it.putExtra("RESULTADO", perdeu)
            startActivity(it)
            finish()
        }

        if (num < numero){
            tentativas--

            if(tentativas == 0 || num == interval_min || num == interval_max ){
                val it = Intent(this, ResultadoActivity::class.java)
                it.putExtra("RESULTADO", perdeu)
                startActivity(it)
                finish()
            } else {
                interval_min = num
                this.tvTentativa.text = "Você tem direito a mais ${tentativas} tentativas e o número encontra-se entre " +
                        "${interval_min} e ${interval_max}"
            }
        }

        if (num > numero){

            tentativas--

            if(tentativas == 0 || num == interval_min || num == interval_max){
                val it = Intent(this, ResultadoActivity::class.java)
                it.putExtra("RESULTADO", perdeu)
                startActivity(it)
                finish()
            } else {
                interval_max = num
                this.tvTentativa.text = "Você tem direito a mais ${tentativas} tentativas e" +
                        " o número encontra-se entre ${interval_min} e ${interval_max}"
            }
        }

        if (interval_min == (numero -1) && interval_max == (numero + 1)){
            val it = Intent(this, ResultadoActivity::class.java)
            var ganhou = "Você ganhou e o número a ser arrochado era ${numero}"
            it.putExtra("RESULTADO", ganhou)
            startActivity(it)
            finish()
        }

    }

    fun gerarRandom( ): Int {
        val rand = Random()
         val min = 1
         val max = 100
        return rand.nextInt(max - min ) + min
    }
}
