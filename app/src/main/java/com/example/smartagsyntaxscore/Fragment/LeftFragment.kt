package com.example.smartagsyntaxscore.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.smartagsyntaxscore.R
import com.example.smartagsyntaxscore.databinding.FragmentLeftBinding

class LeftFragment : Fragment() {
    private var _binding:FragmentLeftBinding?=null
    private val binding get() = _binding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        _binding=FragmentLeftBinding.inflate(inflater,container,false)
        binding!!.nextButton1.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_leftFragment_to_screen1)
        }
        return binding?.root
        }
    }
