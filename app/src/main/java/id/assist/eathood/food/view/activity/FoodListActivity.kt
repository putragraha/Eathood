package id.assist.eathood.food.view.activity

import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import id.assist.eathood.R
import id.assist.eathood.base.BaseActivity
import id.assist.eathood.food.iterator.toBeverages
import id.assist.eathood.food.source.FoodMock
import id.assist.eathood.food.view.adapter.FoodAdapter
import kotlinx.android.synthetic.main.activity_food_list.*

class FoodListActivity : BaseActivity() {

    override fun getLayout(): Int = R.layout.activity_food_list

    override fun initView() {
        rv_food.layoutManager = LinearLayoutManager(this)
        rv_food.adapter = FoodAdapter(FoodMock.data(this).toBeverages())
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