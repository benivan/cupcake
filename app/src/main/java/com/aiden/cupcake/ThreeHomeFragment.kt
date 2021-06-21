package com.aiden.cupcake

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.aiden.cupcake.databinding.FragmentThreeHomeBinding


class ThreeHomeFragment : Fragment() {

    private var _binding: FragmentThreeHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        _binding = FragmentThreeHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnThreeForTwo.setOnClickListener {
            val action = ThreeHomeFragmentDirections.actionThreeHomeFragmentToTwoHomeFragment()
            it.findNavController().navigate(action)
        }

        binding.btnThreeForOne.setOnClickListener {
            val action = ThreeHomeFragmentDirections.actionThreeHomeFragmentToOneHomeFragment()
            it.findNavController().navigate(action)
        }
        binding.btnThreeGotoAccount.setOnClickListener {
            val action = ThreeHomeFragmentDirections.actionThreeHomeFragmentToAccountFragment()
            it.findNavController().navigate(action)
        }
    }
}