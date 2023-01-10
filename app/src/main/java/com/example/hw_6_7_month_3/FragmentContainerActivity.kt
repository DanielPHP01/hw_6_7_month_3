package com.example.hw_6_7_month_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_6_7_month_3.databinding.ActivityFragmentContainerBinding

class FragmentContainerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFragmentContainerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentContainerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getIntentData()

    }

    private fun getIntentData() {
        val car = intent.getParcelableExtra<Car>("car")

        val bundle = Bundle()
        bundle.putParcelable("car", car)

        val detailCarFragment = DetailCarFragment()
        detailCarFragment.arguments = bundle

        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container_view, detailCarFragment).commit()
    }
}