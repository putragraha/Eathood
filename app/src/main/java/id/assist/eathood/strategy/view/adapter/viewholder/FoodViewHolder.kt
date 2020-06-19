package id.assist.eathood.strategy.view.adapter.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import id.assist.eathood.strategy.model.Food
import kotlinx.android.synthetic.main.view_food_item.view.*


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version FoodViewHolder, v 1.3.0 2019-09-20 05:20 by Putra Nugraha
 */


class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(food: Food, listener: (Food) -> Unit) = with(itemView) {
        iv_meal.setImageBitmap(food.picture)
        tv_food_name.text = food.name
        tv_description.text = food.description
        setOnClickListener {
            listener(food)
        }
    }

}