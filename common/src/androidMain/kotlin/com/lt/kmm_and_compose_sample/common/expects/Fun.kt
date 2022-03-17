package com.lt.kmm_and_compose_sample.common.expects

import android.util.Log
import java.util.*

actual fun getUUID(): String {
    return UUID.randomUUID().toString()
}

actual fun String.loge() {
    Log.e("tag", this)
}