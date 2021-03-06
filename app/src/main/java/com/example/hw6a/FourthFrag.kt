package com.example.hw6a

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class FourthFrag : Fragment() {

    private val args: FourthFragArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val nameTake = view?.findViewById<TextView>(R.id.nameTake)
        nameTake?.text = args.name
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_fourth, container, false)
        val button4 = view.findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            findNavController().navigate(R.id.action_fourthFrag_to_firstFrag)
        }

        return view
    }
}