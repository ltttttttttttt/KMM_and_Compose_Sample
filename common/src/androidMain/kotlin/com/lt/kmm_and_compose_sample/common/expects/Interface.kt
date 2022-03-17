package com.lt.kmm_and_compose_sample.common.expects

actual interface Interface {
    actual fun fun1()
    actual fun fun2(): String
    fun fun3() {
        "fun3".loge()
    }
}