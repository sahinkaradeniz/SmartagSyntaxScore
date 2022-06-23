package com.example.smartagsyntaxscore.Fragment

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.smartagsyntaxscore.R
import com.example.smartagsyntaxscore.databinding.FragmentLoginBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding?=null
    private val binding get()=_binding
    private lateinit var auth: FirebaseAuth
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        auth = Firebase.auth
        _binding= FragmentLoginBinding.inflate(inflater,container,false)
        checkUser()
        binding!!.loginButton.setOnClickListener {
            loginUser()
        }

        binding!!.registerLogin.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.login_to_register)
        }
        return binding?.root
    }
    fun loginUser(){
        val password=binding!!.loginPassword.editText?.text.toString()
        val email=binding!!.loginemail.editText?.text.toString()
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener() { task ->
                if (task.isSuccessful) {
                  findNavController().navigate(R.id.login_to_main)
                    // Sign in success, update UI with the signed-in user's information
                    Log.d(TAG, "signInWithEmail:success")
                    val user = auth.currentUser
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w(TAG, "signInWithEmail:failure", task.exception)
                    Toast.makeText(activity, "Authentication failed.",
                        Toast.LENGTH_SHORT).show()

                }
            }
    }
    fun checkUser(){
        val currentUser = auth.currentUser
        if(currentUser != null){
            findNavController().navigate(R.id.login_to_main)
        }
    }
}