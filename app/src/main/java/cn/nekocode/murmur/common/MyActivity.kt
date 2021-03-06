package cn.nekocode.murmur.common

import android.content.Context
import cn.nekocode.kotgo.component.ui.BaseActivity
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper

/**
 * Created by nekocode on 16/3/21.
 */
abstract class MyActivity : BaseActivity() {
    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase))
    }
}