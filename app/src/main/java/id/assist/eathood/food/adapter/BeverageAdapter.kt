package id.assist.eathood.food.adapter

import id.assist.eathood.food.model.Food
import kotlin.random.Random


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version FoodAdapter, v 0.0.1 18/06/20 00.33 by Putra Nugraha
 */
class BeverageAdapter (val food: Food) {

    val name: String
        get() = "${food.name} - Discount ${generateDiscount()}"

    private fun generateDiscount(): String = "${Random.nextInt(0, 100)}%"
}