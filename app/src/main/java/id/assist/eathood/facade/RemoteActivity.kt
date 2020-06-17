package id.assist.eathood.facade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.assist.eathood.R
import id.assist.eathood.facade.device.AC
import id.assist.eathood.facade.device.Light
import id.assist.eathood.facade.remote.HomeRemote
import kotlinx.android.synthetic.main.activity_remote.*

class RemoteActivity : AppCompatActivity() {

    private lateinit var remote: HomeRemote

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_remote)
        initRemote()
        initListener()
    }

    private fun initRemote() {
        remote = HomeRemote(Light(), AC())
    }

    private fun initListener() {
        btnTurnOn.setOnClickListener { tvReport.append(remote.turnOnRoom()) }
        btnNight.setOnClickListener { tvReport.append(remote.nightMode()) }
        btnMorning.setOnClickListener { tvReport.append(remote.morningMode()) }
        btnLeave.setOnClickListener { tvReport.append(remote.leaveRoom()) }
    }
}
