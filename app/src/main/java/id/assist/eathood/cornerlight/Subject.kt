package id.assist.eathood.cornerlight

import id.assist.eathood.cornerlight.Observer


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version Subject, v 1.3.0 2019-12-11 16:54 by Putra Nugraha
 */
interface Subject {

    fun registerObserver(observer: Observer)

    fun removeObserver(observer: Observer)

    fun notifyObservers()
}