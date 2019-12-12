package id.assist.eathood.cornerlight


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version LightColorSubject, v 1.3.0 2019-12-11 16:57 by Putra Nugraha
 */
class CornerLightSubject: Subject {

    val observerList = mutableListOf<Observer>()

    var lightColor: Int = android.R.color.black

    override fun registerObserver(observer: Observer) {
        if (!observerList.contains(observer)) {
            observerList.add(observer)
        }
    }

    override fun removeObserver(observer: Observer) {
        if (observerList.contains(observer)) {
            observerList.remove(observer)
        }
    }

    override fun notifyObservers() {
        observerList.forEach {
            it.update(this.lightColor)
        }
    }

    fun changeColor(color: Int) {
        this.lightColor = color
    }
}