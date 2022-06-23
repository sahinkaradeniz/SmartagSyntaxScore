package com.example.smartagsyntaxscore.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.smartagsyntaxscore.R
import com.example.smartagsyntaxscore.databinding.FragmentScreen12Binding


class Screen1_2 : Fragment() {

    private var _binding:FragmentScreen12Binding?=null
    private val binding get() = _binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       _binding=FragmentScreen12Binding.inflate(inflater,container,false)
        binding!!.nextButton13.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_screen1_2_to_screen1_3)
        }
        return binding?.root
    }


}