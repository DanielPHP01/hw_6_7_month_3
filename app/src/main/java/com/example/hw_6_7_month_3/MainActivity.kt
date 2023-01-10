package com.example.hw_6_7_month_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_6_7_month_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private var arrayList: ArrayList<Car>? = null
    lateinit var adapter: CarAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadData()
        setAdapter()
    }

    private fun setAdapter() {
        if (arrayList != null) {
            adapter = CarAdapter(arrayList!!) {
                val intent = Intent(this, FragmentContainerActivity::class.java)
                intent.putExtra("car", it)
                startActivity(intent)
            }
            binding.recyclerViewCar.adapter = adapter
        }
    }

    private fun loadData() {
        arrayList = ArrayList()
        arrayList?.add(
            Car(
                name = "BMW",
                year = 2022,
                photo = "https://images.netdirector.co.uk/gforces-auto/image/upload/q_auto,c_fill,f_auto,fl_lossy,w_1920,h_1080/auto-client/fede2c14655c9c97e6c274c8dce66dcb/x7_landing_pages_1920x1080_01_37_.jpg",
                isHave = true,
                price = 200000
            )
        )
        arrayList?.add(Car(name = "BMW", year = 2022, photo = "", isHave = true, price = 200000))
        arrayList?.add(Car(name = "BMW", year = 2022, photo = "", isHave = true, price = 200000))
        arrayList?.add(Car(name = "BMW", year = 2022, photo = "", isHave = true, price = 200000))
        arrayList?.add(Car(name = "BMW", year = 2022, photo = "", isHave = true, price = 200000))
        arrayList?.add(Car(name = "BMW", year = 2022, photo = "", isHave = true, price = 200000))
        arrayList?.add(Car(name = "BMW", year = 2022, photo = "", isHave = true, price = 200000))
        arrayList?.add(Car(name = "BMW", year = 2022, photo = "", isHave = true, price = 200000))
    }
}
