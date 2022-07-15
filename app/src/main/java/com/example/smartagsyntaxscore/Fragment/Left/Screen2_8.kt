package com.example.smartagsyntaxscore.Fragment.Left

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.smartagsyntaxscore.R
import com.example.smartagsyntaxscore.databinding.FragmentScreen28Binding


class Screen2_8 : Fragment() {
    private var _binding: FragmentScreen28Binding?=null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding=FragmentScreen28Binding.inflate(inflater,container,false)
        binding.nextButton29.setOnClickListener {
            findNavController().navigate(R.id.action_screen2_8_to_screen2_9)
        }
        return binding.root
    }

}