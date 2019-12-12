package id.assist.eathood.cornerlight

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatCheckBox
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

    private val viewMap = mutableMapOf<AppCompatCheckBox, ImageView>()

    private val observerMap = mutableMapOf<View, Observer>()

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
        initView()
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

    private fun initView() {
        viewMap.putAll(
            mapOf(
                cb_top_left to iv_light_top_left,
                cb_top_right to iv_light_top_right,
                cb_bottom_left to iv_light_bottom_left,
                cb_bottom_right to iv_light_bottom_right
            )
        )
    }

    private fun initCornerLight() {
        subject = CornerLightSubject()
        viewMap.forEach {(_, v) ->
                observerMap[v] = CornerLightObserver(v)
                subject.registerObserver(observerMap[v]!!)
        }
    }

    private fun initCheckboxListener() {
        viewMap.forEach {(k, v) ->
            k.setOnCheckedChangeListener{_, isChecked ->
                val observer = observerMap[v]
                if (isChecked) {
                    subject.registerObserver(observer!!)
                } else {
                    subject.removeObserver(observer!!)
                }
            }
        }
    }

    private fun startChangeLightColor() {
        GlobalScope.launch {
            colorList.forEach {
                delay(1000)
                if (subject is CornerLightSubject) {
                    val cornerLightSubject = subject as CornerLightSubject
                    cornerLightSubject.changeColor(it)
                    cornerLightSubject.notifyObservers()
                }
            }
        }
    }
}