package com.example.besmarter_allis_imagegame.presentation.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.airbnb.lottie.LottieAnimationView
import com.example.besmarter_allis_imagegame.R
import com.example.besmarter_allis_imagegame.databinding.FragmentStartImageBinding
import com.example.besmarter_allis_imagegame.extensions.visibility

class StartImageGameFragment : Fragment() {

    private var _binding: FragmentStartImageBinding? = null
    private val binding get() = _binding!!
    private var counterI: Int = 0
    private val lotty: LottieAnimationView? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        val viewModel = ViewModelProvider(this).get(StartImageGameViewModel::class.java)
        _binding = FragmentStartImageBinding.inflate(inflater, container, false)
        binding.lotty.setAnimation(R.raw.stak_change)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.raoBtn.visibility(true)
        binding.startImageBtn.visibility(false)

        binding.raoBtn.setOnClickListener {
            binding.btn8.visibility(true)
            binding.btn12.visibility(true)
            binding.btn16.visibility(true)
            binding.btn20.visibility(true)
        }

        binding.btn8.setOnClickListener {
            counterI = 8
           binding.linearLayoutWithNumber.visibility(false)
            binding.raoBtn.visibility(false)
            binding.startImageBtn.visibility(true)
        }

        binding.btn12.setOnClickListener {
            counterI = 12
            binding.linearLayoutWithNumber.visibility(false)
            binding.raoBtn.visibility(false)
            binding.startImageBtn.visibility(true)
        }
        binding.btn16.setOnClickListener {
            counterI = 16
            binding.linearLayoutWithNumber.visibility(false)
            binding.raoBtn.visibility(false)
            binding.startImageBtn.visibility(true)
        }
        binding.btn20.setOnClickListener {
            counterI = 20
            binding.linearLayoutWithNumber.visibility(false)
            binding.raoBtn.visibility(false)
            binding.startImageBtn.visibility(true)
        }

        binding.startImageBtn.setOnClickListener {
            val bundle = Bundle()
            bundle.putSerializable("KEY", counterI)
            parentFragmentManager.setFragmentResult("RK_KEY", bundle)
            findNavController().navigate(R.id.navigation_image_game)

        }
        binding.toolbar.ivBack.setOnClickListener {
            requireActivity().finish()

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}