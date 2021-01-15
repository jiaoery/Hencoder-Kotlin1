package com.example.app

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.app.entity.User

/**
 * ClassName: com.example.app.MainActivity<br/>
 * Description: TODO Description. <br/>
 * date: 2020/12/25 0:26<br/>
 *
 * @author Administrator
 * @version V1.0.0
 * @since JDK 1.8
 */
class MainActivity :AppCompatActivity(),View.OnClickListener{


    private val usernameKey:String = "username"
    private val passwordKey:String = "password"

    //之后赋值
    private var et_username:EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var user :User? = null
        var user2:User = User()
        
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}