package com.example.smartagsyntaxscore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.smartagsyntaxscore.databinding.FragmentMainBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainFragment : Fragment() {
    private var _binding:FragmentMainBinding?=null
    private val binding get() = _binding
    private lateinit var auth: FirebaseAuth
    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        // Initialize Firebase Auth
        auth = Firebase.auth
        _binding=FragmentMainBinding.inflate(inflater,container,false)
        binding!!.login.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.main_to_login)
            auth.signOut()
        }
        return binding?.root

    }
}