package com.example.smartagsyntaxscore.Fragment.Left

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.smartagsyntaxscore.R
import com.example.smartagsyntaxscore.databinding.FragmentScreen1Binding


class Screen1 : Fragment() {

    private var _binding:FragmentScreen1Binding?=null
    private val binding get() = _binding
    private var item:String="unkown"
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentScreen1Binding.inflate(inflater,container,false)
        binding!!.nextButton11.setOnClickListener {
            if (item !="unkown"){
                if (item=="no"){
                    findNavController().navigate(R.id.action_screen1_to_screen2_52)
                }
                if (item=="yes")
                {
                    findNavController().navigate(R.id.action_screen1_to_screen1_1)
                }
            }else{
                Toast.makeText(context,"please select following option", Toast.LENGTH_SHORT).show()
            }

        }
        binding!!.radioGroup.setOnCheckedChangeListener { radioGroup, i ->
            if(R.id.radioNo==i){
                item="no"
            }
            if (R.id.radioYes==i){
                item="yes"
            }

        }



        return binding?.root
    }


}