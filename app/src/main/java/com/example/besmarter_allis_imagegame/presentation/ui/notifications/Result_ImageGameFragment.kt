package com.example.besmarter_allis_imagegame.presentation.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.besmarter_allis_imagegame.databinding.FragmentImageGameBinding

import com.example.besmarter_allis_imagegame.databinding.FragmentResultImageGameBinding
import com.example.besmarter_allis_imagegame.extensions.visibility

class Result_ImageGameFragment : Fragment() {

    private var _binding: FragmentResultImageGameBinding? = null
    private val binding get() = _binding!!
    var counter: Int = 0
    var counterS: String? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        val viewModel =
//            ViewModelProvider(this).get(Result_ImageGameViewModel::class.java)

        _binding = FragmentResultImageGameBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnOneCheck.setOnClickListener {
            if (binding.oneNumber.text.toString()
                    .equals(binding.oneNumberFromUser.text.toString())
            ) {
                binding.tvVerno.visibility(true)
                binding.tvNeverno.visibility(false)
                counter++
                counterS = counter.toString()
                binding.tvResultCounter.text = counterS.toString()
            } else {
                binding.tvNeverno.visibility(true)
                binding.tvVerno.visibility(false)
                counter--
                counterS = counter.toString()
                binding.tvResultCounter.text = counterS.toString()
            }

        }



        binding.toolbarResult.ivBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}