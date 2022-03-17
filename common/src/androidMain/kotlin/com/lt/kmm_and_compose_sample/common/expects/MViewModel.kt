package com.lt.kmm_and_compose_sample.common.expects

import androidx.lifecycle.ViewModel

open class MyViewModel : ViewModel() {
    override fun onCleared() {
        super.onCleared()
    }
}

actual typealias MViewModel = MyViewModel