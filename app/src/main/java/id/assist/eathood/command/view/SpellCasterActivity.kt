package id.assist.eathood.command.view

import id.assist.eathood.R
import id.assist.eathood.base.BaseActivity
import id.assist.eathood.command.command.BlizzagaCommand
import id.assist.eathood.command.command.Command
import id.assist.eathood.command.command.FiragaCommand
import id.assist.eathood.command.command.ThundagaCommand
import id.assist.eathood.command.invoker.Bracelet
import id.assist.eathood.command.invoker.UltimateBracelet
import kotlinx.android.synthetic.main.activity_spell_caster.*


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version SpellCasterActivity, v 1.3.0 2020-05-10 09:15 by Putra Nugraha
 */
class SpellCasterActivity: BaseActivity() {

    private lateinit var bracelet: Bracelet

    override fun getLayout(): Int = R.layout.activity_spell_caster

    override fun initView() {
        bracelet = UltimateBracelet(tvSpellCast)
        initSpellListener()
    }

    private fun initSpellListener() {
        btnFiraga.setOnClickListener { spellCast(FiragaCommand(tvSpellCast)) }
        btnBlizzaga.setOnClickListener { spellCast(BlizzagaCommand(tvSpellCast)) }
        btnThundaga.setOnClickListener { spellCast(ThundagaCommand(tvSpellCast)) }
        btnUndo.setOnClickListener { bracelet.undoSpell() }
    }

    private fun spellCast(command: Command) {
        bracelet.setCommand(command)
        bracelet.spellCast()
    }
}