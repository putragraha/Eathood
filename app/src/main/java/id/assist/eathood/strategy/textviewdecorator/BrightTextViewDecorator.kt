package id.assist.eathood.strategy.textviewdecorator

import android.content.Context
import android.view.View
import android.widget.TextView
import android.widget.Toast
import id.assist.eathood.contract.TextViewDecorator


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version BrightViewDecorator, v 1.3.0 2019-09-20 08:40 by Putra Nugraha
 */
class BrightTextViewDecorator(val context: Context) : TextViewDecorator, View.OnClickListener {

    override fun onClick(view: View?) {
        Toast.makeText(context, "I am Red", Toast.LENGTH_SHORT).show()
    }

    override fun doMagic(textView: TextView) {
        textView.setTextColor(context.resources.getColor(android.R.color.holo_red_light))
        onClick(textView)
    }
}