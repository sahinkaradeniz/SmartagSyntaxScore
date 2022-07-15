package com.example.smartagsyntaxscore.Fragment.Left

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.smartagsyntaxscore.R
import com.example.smartagsyntaxscore.databinding.FragmentScreen28Binding
import com.example.smartagsyntaxscore.databinding.FragmentScreen29Binding


class Screen2_9 : Fragment() {
    private var _binding: FragmentScreen29Binding?=null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding= FragmentScreen29Binding.inflate(inflater,container,false)
        binding.nextButton210.setOnClickListener {
            findNavController().navigate(R.id.action_screen2_9_to_screen2_10)
        }
        return binding.root
    }

}