package com.lt.kmm_and_compose_sample.android

import com.lt.kmm_and_compose_sample.common.App
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import com.lt.kmm_and_compose_sample.common.NumberList
import com.lt.kmm_and_compose_sample.common.testExpect

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                //App()//官方示例
                //NumberList()//简单示例: https://blog.csdn.net/qq_33505109/article/details/123497999
                testExpect()//expect示例: https://blog.csdn.net/qq_33505109/article/details/123560909
            }
        }
    }
}