package com.example.smartagsyntaxscore.Fragment.Left

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.smartagsyntaxscore.R
import com.example.smartagsyntaxscore.databinding.FragmentScreen26Binding
import com.example.smartagsyntaxscore.databinding.FragmentScreen27Binding


class Screen2_7 : Fragment() {
    private var _binding: FragmentScreen27Binding?=null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding= FragmentScreen27Binding.inflate(inflater,container,false)
        binding.nextButton28.setOnClickListener {
            findNavController().navigate(R.id.action_screen2_7_to_screen2_8)
        }
        return binding.root  }

}