package com.example.smartagsyntaxscore.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.smartagsyntaxscore.R
import com.example.smartagsyntaxscore.databinding.FragmentScreen1Binding


class Screen1 : Fragment() {

    private var _binding:FragmentScreen1Binding?=null
    private val binding get() = _binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentScreen1Binding.inflate(inflater,container,false)
        binding!!.nextButton11.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_screen1_to_screen1_1)
        }


        return binding?.root
    }


}