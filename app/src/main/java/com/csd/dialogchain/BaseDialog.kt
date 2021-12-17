package com.csd.dialogchain

import android.content.Context
import android.os.Bundle
import androidx.annotation.CallSuper
import androidx.appcompat.app.AlertDialog

/**

 * Author：岑胜德 on 2021/11/26 21:42

 * 说明：

 */
abstract class BaseDialog(context: Context) : AlertDialog(context), DialogInterceptor {

    private var mChain: DialogChain? = null

    /*下一个拦截器*/
    fun chain(): DialogChain? = mChain

    @CallSuper
    override fun intercept(chain: DialogChain) {
        mChain = chain
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window?.attributes?.width = 250.dp2px(context)
        window?.attributes?.height = 300.dp2px(context)

    }


}