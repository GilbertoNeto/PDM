package com.example.gilbertoneto.compartilhaimagem

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.support.v4.content.FileProvider
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

class MainActivity : AppCompatActivity() {

    lateinit var btCamera:Button
    lateinit var btCompartilhar:Button
    lateinit var tvFunciona:TextView
    var CAPTURE:Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btCamera = findViewById(R.id.btCamera)
        this.btCompartilhar = findViewById(R.id.btCompartilha)
        this.tvFunciona = findViewById(R.id.tvFuncionou)

        this.btCamera.setOnClickListener({tiraFoto(it)})
    }

    fun tiraFoto(view:View){

        val mLocationForPhotos: Uri
        var dir = getExternalFilesDir(Environment.DIRECTORY_PICTURES)
       var arquivo = File(dir, "foto.jpg")

        mLocationForPhotos = Uri.fromFile(arquivo)

        val it = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        it.putExtra(MediaStore.EXTRA_OUTPUT, mLocationForPhotos)

//        it.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(arquivo))

        startActivityForResult(it, CAPTURE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == CAPTURE && resultCode == Activity.RESULT_OK && data != null){
            if (requestCode == 1) {
                tvFunciona.setText("FUNCIONOU")
            }
        }
    }

}
