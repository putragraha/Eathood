package id.assist.eathood.food.model

import android.graphics.Bitmap


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version Food, v 1.1.0 2019-08-27 23:37 by Putra Nugraha
 */

data class Food(
    var name: String,
    val picture: Bitmap,
    val description: String
)