package com.example.hw6a

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController

class SecondFrag : Fragment() {

    //private val args: SecondFragArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val nameGive = view?.findViewById<EditText>(R.id.nameGive)
        val name = nameGive?.text.toString()
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val button2 = view.findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val action = SecondFragDirections.actionSecondFragToFourthFrag(name)
            findNavController().navigate(action)
            //findNavController().navigate(R.id.action_secondFrag_to_fourthFrag)
        }

        return view
    }
}