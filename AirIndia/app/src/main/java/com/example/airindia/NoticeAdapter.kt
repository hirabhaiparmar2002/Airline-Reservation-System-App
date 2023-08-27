package com.example.airindia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NoticeAdapter(private val noticelist: ArrayList<Notice>): RecyclerView.Adapter<NoticeAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemview = LayoutInflater.from(parent.context).inflate(R.layout.notice_admin_item,parent,false)
        return MyViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        var currentitem = noticelist[position]

        holder.n_id.text = currentitem.id
        holder.n_content.text = currentitem.content
    }

    override fun getItemCount(): Int {
        return noticelist.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        var n_id:TextView = itemView.findViewById(R.id.notice_id)
        var n_content:TextView = itemView.findViewById(R.id.notice_content)
    }
}