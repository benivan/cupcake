package com.aiden.cupcake

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.aiden.cupcake.databinding.FragmentTwoHomeBinding


class TwoHomeFragment : Fragment() {


   private var _binding:FragmentTwoHomeBinding? = null
    private val  binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        _binding = FragmentTwoHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnTwoForOne.setOnClickListener {
            val action = TwoHomeFragmentDirections.actionTwoHomeFragmentToOneHomeFragment()
            it.findNavController().navigate(action)
        }

        binding.btnTwoForThree.setOnClickListener {
            val action = TwoHomeFragmentDirections.actionTwoHomeFragmentToThreeHomeFragment()
            it.findNavController().navigate(action)
        }
    }


}