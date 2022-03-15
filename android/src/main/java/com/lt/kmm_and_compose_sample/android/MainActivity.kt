package com.lt.kmm_and_compose_sample.android

import com.lt.kmm_and_compose_sample.common.App
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import com.lt.kmm_and_compose_sample.common.NumberList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                //App()
                NumberList()
            }
        }
    }
}