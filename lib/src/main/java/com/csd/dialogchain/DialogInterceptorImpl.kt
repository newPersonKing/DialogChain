package com.csd.dialogchain

import androidx.annotation.CallSuper

/**

 * Author：岑胜德 on 2021/11/22 00:23

 * 说明：

 */
class DialogInterceptorImpl : DialogInterceptor {
    private var mChain: DialogChain? = null

    @CallSuper
    override fun intercept(chain: DialogChain) {
        mChain = chain
    }


    /*执行下一个拦截器*/
    fun chain(): DialogChain? = mChain

}