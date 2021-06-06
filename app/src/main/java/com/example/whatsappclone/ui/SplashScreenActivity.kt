package com.example.whatsappclone.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.whatsappclone.MainActivity
import com.example.whatsappclone.R


class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({ //This method will be executed once the timer is over
            // Start your app main activity
            startActivity( Intent(this@SplashScreenActivity, MainActivity::class.java))
            // close this activity
            finish()
        }, 3000)
    }
}