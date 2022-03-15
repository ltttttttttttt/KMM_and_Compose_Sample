package com.lt.kmm_and_compose_sample.common

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * creator: lt  2022/3/15  lt.dygzs@qq.com
 * effect : 简单的根据数量放置list的条目
 * warning:
 */
@Composable
fun NumberList() {
    //设置数量的状态对象(State)
    var number by remember { mutableStateOf(5) }
    //相当于竖向的线性布局
    Column {
        //相当于横向的线性布局
        Row {
            //设置一个按钮
            Button({
                //按钮的点击事件,点击后改变状态对象内的值,会引发使用该对象的compose组件重组
                number++
            }) {
                //设置按钮内的组件ui
                Text("数量+1")
            }
            //设置一个宽度为8dp的占位,相当于将他们两个隔开了一点(就像margin)
            Spacer(Modifier.width(8.dp))
            Button({
                number--
            }) {
                Text("数量-1")
            }
            Spacer(Modifier.width(8.dp))
            Text("总数量:$number")
            Button({
                number = getNumber()
            }) {
                Text("从本地加载数量")
            }
        }
        Spacer(Modifier.height(8.dp))
        //相当于竖向的RecyclerView
        LazyColumn {
            //相当于RecyclerView.Adapter,只不过更简单
            items(number) {
                //设置item的ui
                Item(it)
            }
        }
    }
}

@Composable
fun Item(index: Int) {
    //我们的item的ui中只有一个文字,并且设置了一下padding
    Text("索引为:$index", modifier = Modifier.padding(5.dp))
}
