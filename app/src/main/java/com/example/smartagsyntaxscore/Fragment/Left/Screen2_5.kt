package com.example.smartagsyntaxscore.Fragment.Left

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.smartagsyntaxscore.R
import com.example.smartagsyntaxscore.databinding.FragmentScreen25Binding


class Screen2_5 : Fragment() {
private var _binding:FragmentScreen25Binding?=null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding= FragmentScreen25Binding.inflate(inflater,container,false)
        binding.nextButton26.setOnClickListener {
            findNavController().navigate(R.id.action_screen2_52_to_screen2_6)
        }
        return binding.root

    }

}