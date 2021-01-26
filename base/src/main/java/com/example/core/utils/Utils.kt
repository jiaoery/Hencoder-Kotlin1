package com.example.core.utils

import android.content.res.Resources
import android.util.DisplayMetrics
import android.util.TypedValue
import android.widget.Toast
import com.example.core.BaseApplication

/**
 * ClassName: Utils<br/>
 * Description: TODO Description. <br/>
 * date: 2021/1/21 15:34<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
val displayMetrics:DisplayMetrics = Resources.getSystem().displayMetrics


object Utils{
//    fun dp2px(dp:Float)=
//        TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,dp, displayMetrics)

//拓展函数
    fun Float.dp2px()=
            TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,this, displayMetrics)


    @JvmOverloads
    fun toast(string: String?,during:Int = Toast.LENGTH_SHORT){
        Toast.makeText(BaseApplication.currentApplication(),string,during).show()
    }
}

