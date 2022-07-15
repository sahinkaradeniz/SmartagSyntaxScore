package com.example.smartagsyntaxscore.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.smartagsyntaxscore.R
import com.example.smartagsyntaxscore.databinding.FragmentScreen14Binding

class Screen1_4 : Fragment() {
    private var _binding:FragmentScreen14Binding?=null
    private val binding get() = _binding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding= FragmentScreen14Binding.inflate(inflater,container,false)
        binding!!.nextButton15.setOnClickListener{
           findNavController().navigate(R.id.action_screen1_4_to_screen1_5)
        }
        return binding?.root
    }
}