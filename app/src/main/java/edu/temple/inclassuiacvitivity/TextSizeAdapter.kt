package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(context_: Context, sizes_: Array<Int>) : BaseAdapter() {

    private val context = context_
    private val sizes = sizes_


    override fun getCount(): Int {
        return sizes.size
    }

    override fun getItem(position: Int): Any {
        return sizes[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val txtView = TextView(context)
        txtView.setTextSize(sizes[position].toFloat())
        txtView.text = sizes[position].toString()
        txtView.setPadding(10,10,0,10)
        return txtView
    }

}