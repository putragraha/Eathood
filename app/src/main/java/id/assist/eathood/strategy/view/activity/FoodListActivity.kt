package id.assist.eathood.strategy.view.activity

import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import id.assist.eathood.R
import id.assist.eathood.constant.Variables
import id.assist.eathood.base.BaseActivity
import id.assist.eathood.strategy.source.FoodMock
import id.assist.eathood.strategy.view.adapter.FoodAdapter
import kotlinx.android.synthetic.main.activity_food_list.*

class FoodListActivity : BaseActivity() {

    override fun getLayout(): Int = R.layout.activity_food_list

    override fun initView() {
        rv_food.layoutManager = LinearLayoutManager(this)
        rv_food.adapter = FoodAdapter(FoodMock.data(this)) {
            val intentDetails = Intent(this, FoodDetailsActivity::class.java)
            intentDetails.putExtra(Variables.KEY_FOOD, it)
            startActivity(intentDetails)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_food_list, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.menu_profile -> {
                startActivity(Intent(this, ProfileActivity::class.java))
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}