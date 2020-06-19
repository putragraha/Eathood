package id.assist.eathood.food.view.activity

import android.view.Menu
import android.view.MenuItem
import id.assist.eathood.R
import id.assist.eathood.constant.Variables
import id.assist.eathood.base.BaseActivity
import id.assist.eathood.food.model.Food
import id.assist.eathood.food.abstractfactory.ViewPainterFactory
import kotlinx.android.synthetic.main.activity_food_details.*

/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version FoodDetailsActivity, v 1.1.0 2019-08-29 00:30 by Putra Nugraha
 */

class FoodDetailsActivity : BaseActivity() {

    var light: Boolean = true

    override fun getLayout(): Int = R.layout.activity_food_details

    override fun initView() {
        val food : Food? = intent.extras?.getParcelable(Variables.KEY_FOOD)
        val descriptonText : String = food?.description + "\n\n\n" + "Source: id.wikipedia.org"
        ivFoodImage.setImageBitmap(food?.picture)
        tvFoodDesc.text = descriptonText
        supportActionBar?.title = food?.name
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_food_details, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.menu_toggle_text_color -> {
                decorateContentText()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun decorateContentText() {
        light = !light

        val viewPainter = ViewPainterFactory.createInstance(this, light)
        val textViewPainter = viewPainter.createTextViewPainter()
        val layoutPainter = viewPainter.createLayoutPainter()

        textViewPainter.doMagic(tvFoodDesc)
        layoutPainter.doMagic(svFoodDetails)
    }
}