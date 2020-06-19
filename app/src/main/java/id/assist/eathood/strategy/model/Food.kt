package id.assist.eathood.strategy.model

import android.graphics.Bitmap
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version Food, v 1.1.0 2019-08-27 23:37 by Putra Nugraha
 */

@Parcelize
data class Food(
    val name: String,
    val picture: Bitmap,
    val description: String
) : Parcelable