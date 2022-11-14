package com.example.quizapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.quizapp.R
import com.example.quizapp.databinding.FragmentIntroBinding

class IntroFragment : Fragment() {

    private lateinit var _binding: FragmentIntroBinding
    private  val binding get() = _binding //backing property


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentIntroBinding.inflate(inflater, container, false)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnContinue.setOnClickListener{
            val uname = binding.textViewName.text.toString()
            val dir = IntroFragmentDirections.actionIntroFragmentToHomeFragment(uname)
            findNavController().navigate(dir)
        }
    }
}