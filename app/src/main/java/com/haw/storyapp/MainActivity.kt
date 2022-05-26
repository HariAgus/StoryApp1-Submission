package com.haw.storyapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.haw.storyapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setupFabButtons()
    }

    private fun setupFabButtons() {
        binding.fabAddedStory.apply {
            shrink()
            setOnClickListener(this@MainActivity)
        }
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.fabAddedStory -> {
                expandFAB()
            }
        }
    }

    private fun expandFAB() {
        binding.apply {
            if (!fabAddedStory.isExtended) {
                fabAddedStory.extend()
            } else {
                fabAddedStory.shrink()
            }
        }
    }

}