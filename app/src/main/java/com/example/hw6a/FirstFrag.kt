package com.example.hw6a

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class FirstFrag : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val button1 = view.findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            findNavController().navigate(R.id.action_firstFrag_to_secondFrag)
        }
        val button12 = view.findViewById<Button>(R.id.button12)
        button12.setOnClickListener {
            findNavController().navigate(R.id.action_firstFrag_to_thirdFrag)
        }

        return view
    }

}