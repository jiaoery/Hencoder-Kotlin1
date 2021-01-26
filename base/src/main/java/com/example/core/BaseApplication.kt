package com.example.core

import android.app.Application
import android.content.Context

/**
 * ClassName: BaseApplication<br/>
 * Description: TODO Description. <br/>
 * date: 2021/1/21 16:47<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
class BaseApplication:Application() {

    /**
     * 伴生单例对象，会在内部维护一个内部类结构的的单例对象
     */
    companion object{
        @JvmStatic
        @get:JvmName("currentApplication")
        private lateinit var currentApplication: Application

        @JvmStatic
        fun currentApplication():Context{
            return currentApplication
        }
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        currentApplication = this
    }
}