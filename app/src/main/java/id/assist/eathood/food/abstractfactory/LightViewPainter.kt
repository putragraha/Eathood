package id.assist.eathood.food.abstractfactory

import android.content.Context
import id.assist.eathood.contract.LayoutPainter
import id.assist.eathood.contract.TextViewPainter
import id.assist.eathood.contract.ViewPainter
import id.assist.eathood.food.abstractfactory.layoutpainter.LightLayoutPainter
import id.assist.eathood.food.abstractfactory.textviewpainter.LightTextViewPainter


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version LightViewPainter, v 1.3.0 2020-04-17 21:51 by Putra Nugraha
 */
class LightViewPainter(private val context: Context): ViewPainter {

    override fun createTextViewPainter(): TextViewPainter = LightTextViewPainter(context)

    override fun createLayoutPainter(): LayoutPainter = LightLayoutPainter(context)
}