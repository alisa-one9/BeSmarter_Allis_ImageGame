package com.example.besmarter_allis_imagegame.presentation.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.besmarter_allis_imagegame.R
import com.example.besmarter_allis_imagegame.databinding.FragmentImageGameBinding

abstract class ImageGameFragment : Fragment() {

    private var counterImS: String = ""
    private var _binding: FragmentImageGameBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        val viewModel = ViewModelProvider(this).get(ImageGameViewModel::class.java)
        _binding = FragmentImageGameBinding.inflate(inflater, container, false)
        binding.btnToResultFrag.setOnClickListener {
            findNavController().navigate(R.id.navigation_result_image_game)
        }
      binding.btnNextt.setOnClickListener {
          getData()
//
//            viewModel.liveData.observe(requireActivity()){
//                binding.number01.text = it.year.toString()
//                Glide
//                    .with(this)
//                    .load(it.image)
//                    .into(binding.imageFirst)
//            }
//            viewModel.fetchImage()
        }
        return binding.root
    }


        fun getData(){


        var counter: Int = 0
        var list1 = arrayOf(
            R.drawable.image_00, R.drawable.image_01, R.drawable.image_02, R.drawable.image_03
        )
        var list2 = arrayOf(
            R.drawable.image_04, R.drawable.image_05, R.drawable.image_07, R.drawable.image_08
        )
        var list3 = arrayOf(
            R.drawable.image_09, R.drawable.image_10, R.drawable.image_11, R.drawable.image_12
        )
        var list4 = arrayOf(
            R.drawable.image_13, R.drawable.image14, R.drawable.image_15, R.drawable.image_16
        )
        var list5 = arrayOf(
            R.drawable.image_17, R.drawable.image_18, R.drawable.image_19, R.drawable.image_20
        )
        var l1 = arrayOf("00", "01", "02", "03")
        var l2 = arrayOf("04", "05", "07", "08")
        var l3 = arrayOf("09", "10", "11", "12")
        var l4 = arrayOf("13", "14", "15", "16")
        var l5 = arrayOf("17", "18", "19", "20")


        fun setUpListener() {
            binding.btnNextt.setOnClickListener {
                counter++
                if (counter >= list1.size)
                    counter = 0
                binding.imageFirst.setImageResource(list1[counter])
                binding.imageSecond.setImageResource(list2[counter])
                binding.imageThird.setImageResource(list3[counter])
                binding.imageFourth.setImageResource(list4[counter])
                binding.number01.setText(l1[counter])
                binding.number02.setText(l2[counter])
                binding.number03.setText(l3[counter])
                binding.number04.setText(l4[counter])
            }

            binding.btnBackk.setOnClickListener {
                counter--
                if (counter < 0)
                    counter = list1.size - 1
                binding.imageFirst.setImageResource(list1[counter])
                binding.imageSecond.setImageResource(list2[counter])
                binding.imageThird.setImageResource(list3[counter])
                binding.imageFourth.setImageResource(list4[counter])
                binding.number01.setText(l1[counter])
                binding.number02.setText(l2[counter])
                binding.number03.setText(l3[counter])
                binding.number04.setText(l4[counter])
            }

            parentFragmentManager.setFragmentResultListener(
                "RK_KEY",
                viewLifecycleOwner
            ) { requestKey, result ->
                var counterIm: Int = result.getSerializable("KEY") as Int

                counterImS = counterIm as String
                if (counterIm >= 0)
                    binding.tvCounterIm.text = counterImS.toString()
                else
                    binding.tvCounterIm.text = "0"

            }

        }


    }


}