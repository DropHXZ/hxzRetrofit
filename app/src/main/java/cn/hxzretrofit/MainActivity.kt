package cn.hxzretrofit

import android.app.Activity
import android.os.Bundle

class MainActivity : Activity() {

    var h:Int = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
