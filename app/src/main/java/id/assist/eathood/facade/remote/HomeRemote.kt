package id.assist.eathood.facade.remote

import id.assist.eathood.facade.device.AC
import id.assist.eathood.facade.device.Light


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version HomeRemote, v 0.0.1 18/06/20 01.26 by Putra Nugraha
 */
class HomeRemote(
    private val light: Light,
    private val ac: AC
) {

    fun turnOnRoom() = "${light.turnOn()}${ac.turnOn()}\n"

    fun nightMode() = "${ac.increaseTemperature()}\n"

    fun morningMode() = "${ac.decreaseTemperature()}\n"

    fun leaveRoom() = "${light.turnOff()}${ac.turnOff()}\n"
}