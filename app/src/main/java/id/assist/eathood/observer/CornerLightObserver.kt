package id.assist.eathood.observer

import android.widget.ImageView


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version CornerLightObserver, v 1.3.0 2019-12-11 17:07 by Putra Nugraha
 */
class CornerLightObserver(private val imageView: ImageView) :
    Observer {

    override fun update(color: Int) {
        imageView.setImageResource(color)
    }
}