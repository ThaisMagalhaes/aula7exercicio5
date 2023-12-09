package com.example.aula7exercicio5

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.view.animation.LinearInterpolator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // URL da imagem que você deseja exibir
        val imageUrl = "https://i.pinimg.com/originals/8a/ab/f2/8aabf27e95d407323aa0ccefc147467d.png"

        var imageView = findViewById<ImageView>(R.id.imageView)
        // Use a biblioteca Glide para carregar a imagem na ImageView
        Glide.with(this)
            .load(imageUrl)
            .into(imageView)

        // Adiciona o efeito de rotação à ImageView
        val swing = ObjectAnimator.ofFloat(imageView, "rotation", 0f, 10f, -10f, 5f, -5f, 0f)
        swing.duration = 3000
        swing.repeatCount = ValueAnimator.INFINITE
        swing.start()
    }
}

