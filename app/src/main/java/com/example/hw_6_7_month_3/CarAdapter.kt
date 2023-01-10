package com.example.hw_6_7_month_3;

import android.service.autofill.OnClickAction
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick
import androidx.core.view.size
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_6_7_month_3.Extensions.loadImage
import com.example.hw_6_7_month_3.databinding.ActivityMainBinding
import com.example.hw_6_7_month_3.databinding.ItemCarBinding

class CarAdapter(
    var array: ArrayList<Car>,
    val onClick: (Car) -> Unit
) : RecyclerView.Adapter<CarAdapter.CarViewHolder>() {

    inner class CarViewHolder(var binding: ItemCarBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(car: Car) {
            binding.imageViewPhoto.loadImage(car.photo)
            binding.textName.text = car.name
            binding.textYear.text = car.year.toString()
            binding.textPrice.text = car.price.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        return CarViewHolder(
            ItemCarBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.onBind(array[(holder.adapterPosition)])
        holder.itemView.setOnClickListener { onClick(array[position]) }
    }

    override fun getItemCount(): Int {
        return array.size
    }
}

