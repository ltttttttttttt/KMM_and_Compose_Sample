package com.lt.kmm_and_compose_sample.common

import com.lt.kmm_and_compose_sample.common.expects.*
import kotlin.Enum

@ExpectAnnotation
fun testExpect() {
    getUUID().loge()
    isDebug.toString().loge()
    ExpectAnnotation().toString().loge()
    Enum::class.toString().loge()
    Interface::class.toString().loge()
    Class::class.toString().loge()
    MViewModel().toString().loge()
}