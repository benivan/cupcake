package com.aiden.cupcake

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.aiden.cupcake.databinding.FragmentOneHomeBinding


class OneHomeFragment : Fragment() {

    private var _binding:FragmentOneHomeBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        _binding  = FragmentOneHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnOneForTwo.setOnClickListener {
            val action = OneHomeFragmentDirections.actionOneHomeFragmentToTwoHomeFragment()
            it.findNavController().navigate(action)
        }

        binding.btnOneForThree.setOnClickListener {
            val action = OneHomeFragmentDirections.actionOneHomeFragmentToThreeHomeFragment()
            it.findNavController().navigate(action)
        }
    }



}