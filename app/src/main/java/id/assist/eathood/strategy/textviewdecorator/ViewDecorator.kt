package id.assist.eathood.strategy.textviewdecorator

import android.widget.TextView
import id.assist.eathood.contract.TextViewDecorator


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version ViewDecorator, v 1.3.0 2019-09-20 08:50 by Putra Nugraha
 */
class ViewDecorator(val textViewDecorator: TextViewDecorator) {

    fun decorateTextView(textView: TextView) {
        textViewDecorator.doMagic(textView)
    }
}