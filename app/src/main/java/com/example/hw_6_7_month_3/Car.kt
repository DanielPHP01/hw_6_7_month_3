package com.example.hw_6_7_month_3

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Car(
    var name: String,
    var year: Int,
    var price: Int,
    var photo: String,
    var isHave: Boolean = true
) : Parcelable
