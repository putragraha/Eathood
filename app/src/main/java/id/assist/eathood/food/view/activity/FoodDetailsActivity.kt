package id.assist.eathood.food.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.assist.eathood.R
import id.assist.eathood.constant.Variables
import id.assist.eathood.food.model.Food
import kotlinx.android.synthetic.main.activity_food_details.*

/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version FoodDetailsActivity, v 1.1.0 2019-08-29 00:30 by Putra Nugraha
 */

class FoodDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details)
        initView(intent.extras?.getParcelable(Variables.KEY_FOOD))
    }

    private fun initView(food : Food?) {
        val descriptonText : String = food?.description + "\n\n\n" + "Source: id.wikipedia.org"
        iv_food_image.setImageBitmap(food?.picture)
        tv_food_desc.text = descriptonText
        supportActionBar?.title = food?.name
    }

}