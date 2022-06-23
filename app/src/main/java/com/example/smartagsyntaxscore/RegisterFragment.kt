package com.example.smartagsyntaxscore

import android.content.ContentValues
import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.smartagsyntaxscore.databinding.FragmentRegisterBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.auth.ktx.userProfileChangeRequest
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import model.user

class RegisterFragment : Fragment() {
   private var _binding:FragmentRegisterBinding?=null
    private val binding get() = _binding
    private lateinit var auth: FirebaseAuth
    val db=Firebase.firestore
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding=FragmentRegisterBinding.inflate(inflater,container,false)
        auth = Firebase.auth
        binding!!.registerlogin.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.register_to_login)
        }

        binding!!.registerButton.setOnClickListener {
            userRegister()
        }
        return binding?.root
    }

    fun saveUserDatabase(){
        val user=user()
        user.id=auth.currentUser!!.uid
        user.name=binding!!.registerName1.editText?.text.toString()
        user.email=binding!!.registeremail1.editText?.text.toString()
        db.collection("users").document(auth.currentUser!!.uid).set(user).addOnSuccessListener { documentReference ->
            Log.d(ContentValues.TAG, "DocumentSnapshot added with ID: ${documentReference}")
        }.addOnFailureListener { e ->
            Log.w(ContentValues.TAG, "Error adding document", e)
        }
    }
    fun profileUpdates(){
        val user=Firebase.auth.currentUser
        val profileUpdates= userProfileChangeRequest {
            displayName=binding!!.registerName1.editText?.text.toString()
        }
        user!!.updateProfile(profileUpdates).addOnCompleteListener { task ->
            if (task.isSuccessful){
                Toast.makeText(activity,"Create Profile",Toast.LENGTH_SHORT).show()
            }
        }
    }



    fun userRegister(){
        val email=binding!!.registeremail1.editText?.text.toString()
        val password=binding!!.registerpassword1.editText?.text.toString()
        auth.createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener() { task ->
                if (task.isSuccessful) {
                    profileUpdates()
                    saveUserDatabase()
                    Log.d(TAG, "createUserWithEmail:success")
                } else {
                    Toast.makeText(activity,email,Toast.LENGTH_SHORT).show()
                    // If sign in fails, display a message to the user.
                    Log.w(TAG, "createUserWithEmail:failure", task.exception)
                    Toast.makeText(activity, "Authentication failed.",Toast.LENGTH_SHORT).show()
                }
            }

    }

}



