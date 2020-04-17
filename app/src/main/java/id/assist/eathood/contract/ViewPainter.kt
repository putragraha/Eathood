package id.assist.eathood.contract

/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version ViewPainter, v 1.3.0 2020-04-17 21:47 by Putra Nugraha
 */
interface ViewPainter {

    fun createTextViewPainter(): TextViewPainter

    fun createLayoutPainter(): LayoutPainter
}