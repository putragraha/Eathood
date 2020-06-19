package id.assist.eathood.food.abstractfactory.layoutpainter

import android.content.Context
import android.view.View
import id.assist.eathood.contract.LayoutPainter


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version DarkLayoutPainter, v 1.3.0 2020-04-17 22:02 by Putra Nugraha
 */
class DarkLayoutPainter(private val context: Context): LayoutPainter {

    override fun doMagic(layout: View) {
        layout.setBackgroundColor(context.resources.getColor(android.R.color.black))
    }
}