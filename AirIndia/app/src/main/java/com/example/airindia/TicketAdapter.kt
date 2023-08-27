package com.example.airindia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TicketAdapter(private val ticketlist: ArrayList<Ticket>): RecyclerView.Adapter<TicketAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemview = LayoutInflater.from(parent.context).inflate(R.layout.ticket_item,parent,false)
        return MyViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        var currentitem = ticketlist[position]

        holder.uname.text = currentitem.uname
        holder.useatno.text = currentitem.useatno
        holder.uflightno.text = currentitem.uflightno
        holder.umobileno.text = currentitem.umobileno
        holder.ugender.text = currentitem.ugender
        holder.uage.text = currentitem.uage
        holder.udepart.text = currentitem.udepart
        holder.uarrival.text = currentitem.uarrival
        holder.udate.text = currentitem.udate
        holder.udeparttime.text = currentitem.udeparttime
        holder.uarrivaltime.text = currentitem.uarrivaltime
        holder.uprice.text = currentitem.uprice
        holder.uticketno.text = currentitem.uticketno

    }

    override fun getItemCount(): Int {
        return ticketlist.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        var uname:TextView = itemView.findViewById(R.id.tname)
        var useatno:TextView = itemView.findViewById(R.id.tsno)
        var uflightno:TextView = itemView.findViewById(R.id.tfno)
        var umobileno:TextView = itemView.findViewById(R.id.tmobilenoo)
        var ugender:TextView = itemView.findViewById(R.id.tgender)
        var uage:TextView = itemView.findViewById(R.id.tage)
        var udepart:TextView = itemView.findViewById(R.id.tdepart)
        var uarrival:TextView = itemView.findViewById(R.id.tarrive)
        var udate:TextView = itemView.findViewById(R.id.tdate)
        var udeparttime:TextView = itemView.findViewById(R.id.tdeparttime)
        var uarrivaltime:TextView = itemView.findViewById(R.id.tarrivaltime)
        var uprice:TextView = itemView.findViewById(R.id.tprice)
        var uticketno:TextView = itemView.findViewById(R.id.ttno)
    }
}