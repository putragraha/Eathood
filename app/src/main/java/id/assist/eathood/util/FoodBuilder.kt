package id.assist.eathood.util

import android.content.Context
import id.assist.eathood.food.model.Food


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version FoodUtils, v 1.3.0 2019-09-20 05:42 by Putra Nugraha
 */
class FoodBuilder {

    companion object {

        fun build(
            context: Context,
            titleName: String,
            imageName: String,
            detailsName: String
        ): Food =
            Food(
                titleName,
                AssetsUtils.getImage(imageName, context),
                AssetsUtils.readTxt(detailsName, context)
            )
    }
}