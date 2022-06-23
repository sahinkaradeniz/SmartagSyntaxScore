package com.example.smartagsyntaxscore.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.smartagsyntaxscore.R
import com.example.smartagsyntaxscore.databinding.FragmentScreen13Binding


class Screen1_3 : Fragment() {

    private var _binding: FragmentScreen13Binding?=null
    private val binding get() = _binding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding=FragmentScreen13Binding.inflate(inflater,container,false)

        binding!!.nextButton14.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_screen1_3_to_screen1_4)
        }

        return binding!!.root

    }
}