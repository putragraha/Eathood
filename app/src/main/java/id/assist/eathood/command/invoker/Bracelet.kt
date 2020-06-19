package id.assist.eathood.command.invoker

import id.assist.eathood.command.command.Command


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version Bracelet, v 1.3.0 2020-05-10 09:54 by Putra Nugraha
 */
interface Bracelet {

    fun setCommand(command: Command)

    fun spellCast()

    fun undoSpell()
}