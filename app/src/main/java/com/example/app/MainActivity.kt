package com.example.app

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.app.entity.User
import com.example.core.utils.Utils

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


    private val usernameKey = "username"
    private val passwordKey = "password"

    //之后赋值
    private var et_username:EditText? = null
    private var et_password:EditText?=null
    private var et_code:EditText?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var user :User? = null
        var user2:User = User()
        
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }

    fun login(){
        val username = et_username?.text.toString()
    }

    fun verify(user: User):Boolean{
        if (user.username.length<4){
            Utils.toast("用户名不合法")
            return false
        }
        if(user.password.length<4){
            Utils.toast("密码不合法")
            return false
        }
        return true;
    }
}