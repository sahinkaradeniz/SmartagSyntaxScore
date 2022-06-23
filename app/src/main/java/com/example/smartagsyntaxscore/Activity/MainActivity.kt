package com.example.smartagsyntaxscore.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smartagsyntaxscore.R
import com.example.smartagsyntaxscore.databinding.FragmentMainBinding

class MainActivity : AppCompatActivity() {
    private val _binding:FragmentMainBinding?=null
    private val binding get() = _binding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}