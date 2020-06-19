package id.assist.eathood.food.abstractfactory

import android.content.Context
import id.assist.eathood.contract.ViewPainter


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version ViewPainterFactory, v 1.3.0 2020-04-17 22:04 by Putra Nugraha
 */
class ViewPainterFactory {

    companion object {

        fun createInstance(context: Context, isLight: Boolean): ViewPainter {
            return if (isLight) LightViewPainter(context) else DarkViewPainter(context)
        }
    }
}