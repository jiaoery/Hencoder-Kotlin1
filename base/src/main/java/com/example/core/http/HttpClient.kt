package com.example.core.http

import androidx.annotation.NonNull
import com.google.gson.Gson
import okhttp3.*
import java.io.IOException
import java.lang.reflect.Type

/**
 * ClassName: HttpClient<br/>
 * Description: TODO Description. <br/>
 * date: 2021/1/21 18:27<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
object HttpClient : OkHttpClient() {

    private val gson = Gson()

    @NonNull
    fun <T> convert(json: String?, type: Type): T {
        return gson.fromJson(json, type)
    }

    fun <T> get(path: String, type: Type, entityCallback: EntityCallback<T>) {
        val request: Request = Request.Builder()
                .url("https://api.hencoder.com/$path")
                .build()
        val newCall: Call = this.newCall(request)

        newCall.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                entityCallback.onFailure("网络异常")
            }

            override fun onResponse(call: Call, response: Response) {
                //in i..j相当于 i<=x<j
                //when 相当于switch 但是支持表达式
                when (response.code()) {
                    in 200..299 -> entityCallback.onSuccess(convert(response.body()!!.string(), type))
                    in 400..499 -> entityCallback.onFailure("客户端错误")
                    in 500..599 -> entityCallback.onFailure("服务器错误")
                    else -> entityCallback.onFailure("未知错误")
                }
            }
        })
    }
}