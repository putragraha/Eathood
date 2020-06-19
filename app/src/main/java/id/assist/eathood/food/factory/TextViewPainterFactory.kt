package id.assist.eathood.food.factory

import android.content.Context
import id.assist.eathood.contract.TextViewPainter


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version ViewDecoratorFactory, v 1.3.0 2020-04-17 11:03 by Putra Nugraha
 */
class TextViewPainterFactory {

    companion object {

        fun createInstance(context: Context, isLight: Boolean): TextViewPainter {
            return if (isLight) LightTextViewPainter(context) else DarkTextViewPainter(context)
        }
    }
}