package com.example.app.entity

/**
 * ClassName: User<br/>
 * Description: TODO Description. <br/>
 * date: 2021/1/20 17:11<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
class User {

     var  username:String?= null
     var password:String?= null
     var code:String?= null

    constructor()

    constructor(username:String?,password:String?,code:String?){
        this.username =  username
        this.password = password
        this.code = code
    }
}