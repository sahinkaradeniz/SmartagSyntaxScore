package com.example.smartagsyntaxscore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.smartagsyntaxscore.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding?=null
    private val binding get()=_binding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding= FragmentLoginBinding.inflate(inflater,container,false)
        binding!!.loginButton.setOnClickListener {

        }
        binding!!.register.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.login_to_register)
        }

        return binding?.root
    }

}