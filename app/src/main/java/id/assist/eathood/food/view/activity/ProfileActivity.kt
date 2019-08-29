package id.assist.eathood.food.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.assist.eathood.R


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version ProfileActivity, v 1.1.0 2019-08-29 17:58 by Putra Nugraha
 */

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        supportActionBar?.title = getString(R.string.profile_name)
    }

}