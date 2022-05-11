package com.example.hw6a

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class ThirdFrag : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_third, container, false)
        val button3 = view.findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFrag_to_firstFrag)
        }

        return view
    }
}