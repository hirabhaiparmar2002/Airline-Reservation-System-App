package com.example.airindia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FlightAdapter(private val flightlist: ArrayList<Flight>): RecyclerView.Adapter<FlightAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemview = LayoutInflater.from(parent.context).inflate(R.layout.flight_item,parent,false)
        return MyViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        var currentitem = flightlist[position]

        holder.flight_depart.text = currentitem.flight_depart
        holder.flight_arrival.text = currentitem.flight_arrival
        holder.flight_date.text = currentitem.flight_date
        holder.flight_dep_time.text = currentitem.flight_dep_time
        holder.flight_arr_time.text = currentitem.flight_arr_time
        holder.flight_fno.text = currentitem.flight_fno
        holder.flight_seat.text = currentitem.flight_seat
        holder.flight_price.text = currentitem.flight_price

    }

    override fun getItemCount(): Int {
        return flightlist.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        var flight_depart:TextView = itemView.findViewById(R.id.flight_depart)
        var flight_arrival:TextView = itemView.findViewById(R.id.flight_arrival)
        var flight_date:TextView = itemView.findViewById(R.id.flight_date)
        var flight_dep_time:TextView = itemView.findViewById(R.id.flight_dep_time)
        var flight_arr_time:TextView = itemView.findViewById(R.id.flight_arrival_time)
        var flight_fno:TextView = itemView.findViewById(R.id.flight_fno)
        var flight_seat:TextView = itemView.findViewById(R.id.flight_seat)
        var flight_price:TextView = itemView.findViewById(R.id.flight_price)

    }


}