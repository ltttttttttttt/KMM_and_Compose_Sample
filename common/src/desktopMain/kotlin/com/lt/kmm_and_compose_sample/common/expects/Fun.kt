package com.lt.kmm_and_compose_sample.common.expects

import kotlin.random.Random

actual fun getUUID(): String {
    return Random.nextInt().toString()
}

actual fun String.loge() {
    println(this)
}