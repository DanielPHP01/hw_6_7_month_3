package com.example.hw_6_7_month_3

import android.widget.ImageView
import com.bumptech.glide.Glide

object Extensions {

    fun ImageView.loadImage(photoUri: String){
        Glide.with(this).load((photoUri)).into(this)
    }}