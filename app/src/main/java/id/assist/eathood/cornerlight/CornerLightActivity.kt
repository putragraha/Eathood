package id.assist.eathood.cornerlight

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import id.assist.eathood.*
import kotlinx.android.synthetic.main.activity_corner_light.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version CornerLightActivity, v 1.3.0 2019-12-11 16:37 by Putra Nugraha
 */
class CornerLightActivity : AppCompatActivity() {

    private lateinit var subject: Subject

    private lateinit var topLeftObserver: Observer

    private lateinit var topRightObserver: Observer

    private lateinit var bottomLeftObserver: Observer

    private lateinit var bottomRightObserver: Observer

    private val colorList = listOf(
        android.R.color.holo_red_dark,
        android.R.color.holo_blue_bright,
        android.R.color.holo_red_light,
        android.R.color.holo_green_light,
        android.R.color.holo_blue_dark,
        android.R.color.holo_orange_dark,
        android.R.color.holo_blue_light,
        android.R.color.holo_orange_light,
        android.R.color.holo_purple
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_corner_light)
        initCornerLight()
        initCheckboxListener()
        startChangeLightColor()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_corner_light, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.menu_restart -> {
                startChangeLightColor()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun initCornerLight() {
        subject = CornerLightSubject()
        topLeftObserver =
            CornerLightObserver(iv_light_top_left)
        topRightObserver =
            CornerLightObserver(iv_light_top_right)
        bottomLeftObserver =
            CornerLightObserver(
                iv_light_bottom_left
            )
        bottomRightObserver =
            CornerLightObserver(
                iv_light_bottom_right
            )

        subject.registerObserver(topLeftObserver)
        subject.registerObserver(topRightObserver)
        subject.registerObserver(bottomLeftObserver)
        subject.registerObserver(bottomRightObserver)
    }

    private fun initCheckboxListener() {
        cb_top_left.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                subject.registerObserver(topLeftObserver)
            } else {
                subject.removeObserver(topLeftObserver)
            }
        }
        cb_top_right.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                subject.registerObserver(topRightObserver)
            } else {
                subject.removeObserver(topRightObserver)
            }
        }
        cb_bottom_left.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                subject.registerObserver(bottomLeftObserver)
            } else {
                subject.removeObserver(bottomLeftObserver)
            }
        }
        cb_bottom_right.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                subject.registerObserver(bottomRightObserver)
            } else {
                subject.removeObserver(bottomRightObserver)
            }
        }
    }

    private fun startChangeLightColor() {
        GlobalScope.launch {
            colorList.forEach {
                delay(1000)
                Log.e("Color", it.toString())
                if (subject is CornerLightSubject) {
                    val cornerLightSubject = subject as CornerLightSubject
                    cornerLightSubject.changeColor(it)
                    cornerLightSubject.notifyObservers()
                }
            }
        }
    }
}