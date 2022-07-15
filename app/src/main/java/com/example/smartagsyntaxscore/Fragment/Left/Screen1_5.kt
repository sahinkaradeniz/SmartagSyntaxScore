package com.example.smartagsyntaxscore.Fragment.Left

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.smartagsyntaxscore.R
import com.example.smartagsyntaxscore.databinding.FragmentScreen12Binding
import com.example.smartagsyntaxscore.databinding.FragmentScreen15Binding
import com.google.common.base.MoreObjects



class Screen1_5 : Fragment() {
    private var _binding:FragmentScreen15Binding?=null
    private val binding get() = _binding
    private  var item:String ="unkown"
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding=FragmentScreen15Binding.inflate(inflater,container,false)
        binding!!.radioGroup2.setOnCheckedChangeListener{ group,checkedId ->
            if (R.id.radioButton7_0==checkedId){
                item="0"
            }
            if(R.id.radioButton7_1==checkedId){
               item="1"
            }
            if (R.id.radioButton7_2==checkedId){
                item="2"            }
            if (R.id.radioButton7_3==checkedId){
                item="3"
            }
        }
        binding!!.nextButton152.setOnClickListener {
            if (item!="unkown"){
                if(item=="0"){
                    findNavController().navigate(R.id.action_screen1_5_to_screen2_7)
                }
                if(item=="1"){
                    findNavController().navigate(R.id.action_screen1_5_to_screen2_7)
                }
                if (item=="2"){
                    findNavController().navigate(R.id.action_screen1_5_to_screen2_52)
                }
                if (item=="3"){
                    findNavController().navigate(R.id.action_screen1_5_to_screen2_52)
                }
            }else{
                Toast.makeText(context,"please select following option",Toast.LENGTH_SHORT).show()
            }

        }
        return binding?.root





    }
    fun onRadioButtonClick(view: View){

    }



}