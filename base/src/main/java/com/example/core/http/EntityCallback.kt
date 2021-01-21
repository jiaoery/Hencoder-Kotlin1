package com.example.core.http

/**
 * ClassName: EntityCallback<br/>
 * Description: TODO Description. <br/>
 * date: 2021/1/21 19:46<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
interface EntityCallback<T> {
    fun onSuccess(entity:T)

    fun onFailure(message:String?)
}