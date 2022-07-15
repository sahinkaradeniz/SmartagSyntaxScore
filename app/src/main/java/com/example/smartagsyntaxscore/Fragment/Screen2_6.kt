package com.example.smartagsyntaxscore.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.smartagsyntaxscore.R
import com.example.smartagsyntaxscore.databinding.FragmentScreen26Binding

class Screen2_6 : Fragment() {
    private var _binding:FragmentScreen26Binding?=null
    private val binding get() = _binding!!
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding= FragmentScreen26Binding.inflate(inflater,container,false)
        binding.nextButton27.setOnClickListener {
            findNavController().navigate(R.id.action_screen2_6_to_screen2_7)
        }
        return binding.root
    }

}