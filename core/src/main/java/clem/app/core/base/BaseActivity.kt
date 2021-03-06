package clem.app.core.base

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by leon
 * on 2019/5/31 15:44
 */
abstract class BaseActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResId())
        initData()
        initView()
//        setSupportActionBar(mToolbar)
    }

    abstract fun getLayoutResId(): Int
    abstract fun initView()
    abstract fun initData()

    protected fun startActivity(z: Class<*>) {
        startActivity(Intent(this, z))
    }

    protected fun startActivity(z: Class<*>, name: String, value: Boolean) {
        val intent = Intent(this, z).putExtra(name, value)
        startActivity(intent)
    }
}