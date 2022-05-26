package com.haw.storyapp.ui.story

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.haw.storyapp.databinding.ActivityAddedStoryBinding

class AddedStoryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddedStoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddedStoryBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}