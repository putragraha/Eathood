package id.assist.eathood.food.view.activity

import id.assist.eathood.R
import id.assist.eathood.constant.Variables
import id.assist.eathood.base.BaseActivity
import id.assist.eathood.food.model.Food
import kotlinx.android.synthetic.main.activity_food_details.*

/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version FoodDetailsActivity, v 1.1.0 2019-08-29 00:30 by Putra Nugraha
 */

class FoodDetailsActivity : BaseActivity() {

    override fun getLayout(): Int = R.layout.activity_food_details

    override fun initView() {
        val food : Food? = intent.extras?.getParcelable(Variables.KEY_FOOD)
        val descriptonText : String = food?.description + "\n\n\n" + "Source: id.wikipedia.org"
        iv_food_image.setImageBitmap(food?.picture)
        tv_food_desc.text = descriptonText
        supportActionBar?.title = food?.name
    }
}