package com.example.besmarter_allis_imagegame.core.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.example.besmarter_allis_imagegame.R


//abstract class BaseFragment <VB : ViewBinding> : Fragment() {
//
//    protected  lateinit var binding: VB
//
//    abstract fun bind():VB
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        binding = bind()
//        return binding.root
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        initView()
//        setupListener()
//    }
//
//    abstract fun initView()
//    abstract fun setupListener()
//}