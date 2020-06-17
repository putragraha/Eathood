package id.assist.eathood.food.mapper

import id.assist.eathood.food.adapter.BeverageAdapter
import id.assist.eathood.food.model.Food


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version FoodMapper, v 0.0.1 18/06/20 00.59 by Putra Nugraha
 */
fun List<Food>.toBeverages() = map {
    BeverageAdapter(it)
}