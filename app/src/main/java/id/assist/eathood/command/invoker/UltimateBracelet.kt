package id.assist.eathood.command.invoker

import android.widget.TextView
import id.assist.eathood.command.command.BarehandCommand
import id.assist.eathood.command.command.Command


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version UltimateBracelet, v 1.3.0 2020-05-10 09:57 by Putra Nugraha
 */
class UltimateBracelet(textView: TextView): Bracelet {

    private var prevCommand: Command = BarehandCommand(textView)

    private var command: Command = BarehandCommand(textView)

    override fun setCommand(command: Command) {
        this.prevCommand = this.command
        this.command = command
    }

    override fun spellCast() {
        command.execute()
    }

    override fun undoSpell() {
        prevCommand.execute()
        setCommand(prevCommand)
    }
}