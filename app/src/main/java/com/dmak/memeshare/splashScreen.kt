package com.dmak.memeshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash_screen.*

class splashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val logoAnimation = AnimationUtils.loadAnimation(this,R.anim.logo_animation)
        val textAnimation = AnimationUtils.loadAnimation(this,R.anim.text_animation)

        imageView.startAnimation(logoAnimation)
        textvir.startAnimation(textAnimation)
        val splashScreenTimeout = 4000
        val intent = Intent(this,MainActivity ::class.java)

        Handler().postDelayed({
             startActivity(intent)
            finish()
        },splashScreenTimeout.toLong())
    }
}