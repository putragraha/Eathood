package id.assist.eathood.food.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.assist.eathood.R
import id.assist.eathood.food.model.Food
import kotlinx.android.synthetic.main.view_food_item.view.*


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version FoodAdapter, v 1.1.0 2019-08-27 23:15 by Putra Nugraha
 */

class FoodAdapter(private val foods: List<Food>, private val listener: (Food) -> Unit) :
    RecyclerView.Adapter<FoodAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.view_food_item,
                parent,
                false
            )
        )

    override fun getItemCount(): Int = foods.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(foods[position], listener)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(food: Food, listener: (Food) -> Unit) = with(itemView) {
            iv_meal.setImageBitmap(food.picture)
            tv_food_name.text = food.name
            tv_description.text = food.description
            setOnClickListener {
                listener(food)
            }
        }

    }
}