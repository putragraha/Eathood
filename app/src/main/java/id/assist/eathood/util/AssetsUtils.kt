package id.assist.eathood.util

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.Drawable


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version AssetsUtils, v 1.1.0 2019-08-29 00:06 by Putra Nugraha
 */

class AssetsUtils {

    companion object{
        fun readTxt(filename : String, context : Context) : String =
            context.assets.open(filename).bufferedReader().use{
                it.readText()
            }

        fun getImage(filename: String, context: Context) : Bitmap =
            BitmapFactory.decodeStream(context.assets.open(filename))
    }
}