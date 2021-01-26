package com.example.core.utils

import android.content.Context
import android.content.SharedPreferences
import com.example.core.BaseApplication
import com.example.core.R

/**
 * ClassName: CacheUtils<br/>
 * Description: object 修饰的类，所有的成员变量和函数都变成静态的
 * date: 2021/1/21 15:46<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
object CacheUtils {

    private val context: Context = BaseApplication.currentApplication()

    private val SP:SharedPreferences = context.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE)

    fun save(key:String,value:String)=
        SP.edit().putString(key,value).apply()


    fun get(key: String)=
        SP.getString(key,null)



}