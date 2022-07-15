package com.example.smartagsyntaxscore.Fragment.Left

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.smartagsyntaxscore.R
import com.example.smartagsyntaxscore.databinding.FragmentScreen11Binding

class Screen1_1 : Fragment() {
    private var _binding:FragmentScreen11Binding?=null
    private val binding get() = _binding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding=FragmentScreen11Binding.inflate(inflater,container,false)

        binding!!.nextButton12.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_screen1_1_to_screen1_2)
        }

        return binding?.root
    }

}