package id.assist.eathood.strategy.view.activity

import id.assist.eathood.R
import id.assist.eathood.base.BaseActivity


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version ProfileActivity, v 1.1.0 2019-08-29 17:58 by Putra Nugraha
 */

class ProfileActivity : BaseActivity() {

    override fun getLayout(): Int = R.layout.activity_profile

    override fun initView() {
        supportActionBar?.title = getString(R.string.profile_name)
    }
}