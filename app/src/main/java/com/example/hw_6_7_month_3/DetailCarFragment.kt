package com.example.hw_6_7_month_3

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_6_7_month_3.Extensions.loadImage
import com.example.hw_6_7_month_3.databinding.FragmentDetailCarBinding

class DetailCarFragment : Fragment() {

    private lateinit var binding: FragmentDetailCarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailCarBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val car = arguments?.getParcelable<Car>("car")

        binding.apply {
            textViewName.text = car?.name
            textViewPrice.text = car?.price.toString()
            imageViewPhoto.loadImage(car?.photo!!)
        }
    }
}