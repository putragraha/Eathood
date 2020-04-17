package id.assist.eathood.food.textviewdecorator

import android.widget.TextView
import id.assist.eathood.contract.TextViewPainter


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version ViewDecorator, v 1.3.0 2019-09-20 08:50 by Putra Nugraha
 */
class ViewPainter(private val textViewPainter: TextViewPainter) {

    fun decorateTextView(textView: TextView) {
        textViewPainter.doMagic(textView)
    }
}