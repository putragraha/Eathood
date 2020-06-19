package id.assist.eathood.food.abstractfactory

import android.content.Context
import id.assist.eathood.contract.LayoutPainter
import id.assist.eathood.contract.TextViewPainter
import id.assist.eathood.contract.ViewPainter
import id.assist.eathood.food.abstractfactory.layoutpainter.DarkLayoutPainter
import id.assist.eathood.food.abstractfactory.textviewpainter.DarkTextViewPainter


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version DarkViewPainter, v 1.3.0 2020-04-17 22:03 by Putra Nugraha
 */
class DarkViewPainter(private val context: Context): ViewPainter {

    override fun createTextViewPainter(): TextViewPainter = DarkTextViewPainter(context)

    override fun createLayoutPainter(): LayoutPainter = DarkLayoutPainter(context)
}