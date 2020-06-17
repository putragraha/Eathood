package id.assist.eathood.facade.device


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version AC, v 0.0.1 18/06/20 01.29 by Putra Nugraha
 */
class AC {

    companion object {

        private var temperature = 16
    }

    fun turnOn() = "AC turned on\n"

    fun turnOff() = "AC turned off\n"

    fun increaseTemperature() = "AC temperature increased to ${++temperature}\n"

    fun decreaseTemperature() = "AC temperature decreased to ${--temperature}\n"
}