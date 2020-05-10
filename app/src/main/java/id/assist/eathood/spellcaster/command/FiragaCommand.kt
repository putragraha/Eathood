package id.assist.eathood.spellcaster.command

import android.annotation.SuppressLint
import android.widget.TextView


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version FiragaCommand, v 1.3.0 2020-05-10 09:46 by Putra Nugraha
 */
class FiragaCommand(private val textView: TextView): Command {

    @SuppressLint("SetTextI18n")
    override fun execute() {
        textView.text = "Firaga burst"
    }
}