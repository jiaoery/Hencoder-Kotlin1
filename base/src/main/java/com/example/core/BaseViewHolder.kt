package com.example.core

import android.annotation.SuppressLint
import android.view.View
import android.widget.TextView
import androidx.annotation.IdRes
import androidx.recyclerview.widget.RecyclerView
import java.util.*

/**
 * ClassName: BaseViewHolder<br/>
 * Description: TODO Description. <br/>
 * date: 2021/1/21 19:50<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
abstract class BaseViewHolder:RecyclerView.ViewHolder {

    constructor(itemView: View):super(itemView)

    @SuppressLint("UseSparseArrays")
    private val viewHashMap: MutableMap<Int, View?> = HashMap()

    protected open fun <T : View?> getView(@IdRes id: Int): T? {
        var view = viewHashMap[id]
        if (view == null) {
            view = itemView.findViewById(id)
            viewHashMap[id] = view
        }
        return view as T?
    }

    protected open fun setText(@IdRes id: Int, text: String?) {
        (getView<View>(id) as TextView).text = text
    }
}