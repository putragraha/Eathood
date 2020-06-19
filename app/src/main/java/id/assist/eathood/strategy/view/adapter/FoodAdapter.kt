package id.assist.eathood.strategy.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.assist.eathood.R
import id.assist.eathood.strategy.model.Food
import id.assist.eathood.strategy.view.adapter.viewholder.FoodViewHolder


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version FoodAdapter, v 1.1.0 2019-08-27 23:15 by Putra Nugraha
 */

class FoodAdapter(private val foods: List<Food>, private val listener: (Food) -> Unit) :
    RecyclerView.Adapter<FoodViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder =
        FoodViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.view_food_item,
                parent,
                false
            )
        )

    override fun getItemCount(): Int = foods.size

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.bind(foods[position], listener)
    }
}