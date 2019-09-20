package id.assist.eathood.food.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version BaseActivity, v 1.3.0 2019-09-20 07:57 by Putra Nugraha
 */
abstract class BaseActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        initView()
    }

    abstract fun getLayout() : Int
    abstract fun initView()
}