package com.csd.dialogchain

import android.content.Context

/**

 * Author：岑胜德 on 2021/12/2 02:26

 * 说明：

 */
fun Int.dp2px(context: Context): Int {
    val scale = context.resources.displayMetrics.density
    return (this * scale + 0.5f).toInt()
}