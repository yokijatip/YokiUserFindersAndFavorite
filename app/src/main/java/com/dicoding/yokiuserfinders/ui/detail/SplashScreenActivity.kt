package com.dicoding.yokiuserfinders.ui.detail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.dicoding.yokiuserfinders.R
import com.dicoding.yokiuserfinders.databinding.ActivitySplashScreenBinding
import com.dicoding.yokiuserfinders.ui.main.MainActivity

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //        Menjalankan Animasi
        binding.apply {
            tvSplashScreenTitle.animate().alpha(1f).setDuration(2000).start()
            tvSplashScreenHeadline.animate().alpha(1f).setDuration(2000).start()
            tvSplashScreenDescription.animate().alpha(1f).setDuration(2000).start()
            ivSplashScreen.animate().alpha(1f).setDuration(2000).start()
            Handler().postDelayed({
                val intent = Intent(this@SplashScreenActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            }, 2000)
        }

    }
}