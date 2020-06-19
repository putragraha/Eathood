package id.assist.eathood.command.command

import android.annotation.SuppressLint
import android.widget.TextView


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version BarehandCommand, v 1.3.0 2020-05-10 09:58 by Putra Nugraha
 */
class BarehandCommand(private val textView: TextView): Command {

    @SuppressLint("SetTextI18n")
    override fun execute() {
        textView.text = "Punch right in the face"
    }
}