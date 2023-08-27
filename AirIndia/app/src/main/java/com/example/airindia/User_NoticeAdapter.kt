package com.example.airindia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class User_NoticeAdapter(private val usernoticelist: ArrayList<UserNotice>): RecyclerView.Adapter<User_NoticeAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemview = LayoutInflater.from(parent.context).inflate(R.layout.notice_item,parent,false)
        return MyViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        var currentitem = usernoticelist[position]

        holder.n_content.text = currentitem.content
    }

    override fun getItemCount(): Int {
        return usernoticelist.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        var n_content:TextView = itemView.findViewById(R.id.user_notice_content)
    }
}