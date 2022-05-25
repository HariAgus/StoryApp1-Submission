package com.haw.storyapp.ui.splash

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.haw.storyapp.databinding.ActivitySplashScreenBinding
import com.haw.storyapp.ui.login.LoginActivity
import com.haw.storyapp.utils.startActivity

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageLogo.apply {
            alpha = 0F
            animate().setDuration(2000).alpha(1F).withEndAction {
                binding.tvNameApp.alpha = 1F
                startActivity<LoginActivity>()
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                finish()
            }
        }
    }

}