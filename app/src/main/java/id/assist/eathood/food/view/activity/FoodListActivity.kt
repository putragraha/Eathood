package id.assist.eathood.food.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import id.assist.eathood.R
import id.assist.eathood.constant.Variables
import id.assist.eathood.food.source.FoodMock
import id.assist.eathood.food.view.adapter.FoodAdapter
import kotlinx.android.synthetic.main.activity_food_list.*

class FoodListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_list)
        initView()
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

    private fun initView() {
        rv_food.layoutManager = LinearLayoutManager(this)
        rv_food.adapter = FoodAdapter(FoodMock.data(this)) {
            val intentDetails = Intent(this, FoodDetailsActivity::class.java)
            intentDetails.putExtra(Variables.KEY_FOOD, it)
            startActivity(intentDetails)
        }
    }

}