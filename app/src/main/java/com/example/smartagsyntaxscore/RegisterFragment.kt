package com.example.smartagsyntaxscore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.smartagsyntaxscore.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {
   private var _binding:FragmentRegisterBinding?=null
    private val binding get() = _binding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding=FragmentRegisterBinding.inflate(inflater,container,false)
        binding!!.registerlogin.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.register_to_login)
        }
        return binding?.root
    }


}