package com.example.smartagsyntaxscore.Fragment.Left

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.smartagsyntaxscore.R
import com.example.smartagsyntaxscore.databinding.FragmentScreen210Binding
import com.example.smartagsyntaxscore.databinding.FragmentScreen28Binding


class Screen2_10 : Fragment() {
    private var _binding: FragmentScreen210Binding?=null
    private val binding get() = _binding!!
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding= FragmentScreen210Binding.inflate(inflater,container,false)
        return binding.root
    }

}