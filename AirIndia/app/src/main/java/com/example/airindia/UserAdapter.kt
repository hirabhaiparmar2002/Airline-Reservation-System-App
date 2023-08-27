package com.example.airindia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(private val userlist: ArrayList<User>):RecyclerView.Adapter<UserAdapter.myViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.user_item,parent,false)
        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        val currentitem = userlist[position]

        holder.Name.text = currentitem.name
        holder.Email.text = currentitem.email
        holder.Address.text = currentitem.address
        holder.Mobileno.text = currentitem.mobileno
        holder.Gender.text = currentitem.gender
        holder.Age.text = currentitem.age
        holder.Qualification.text = currentitem.qualification
        holder.Fathername.text = currentitem.fathername
        holder.Dob.text = currentitem.dob
    }

    override fun getItemCount(): Int {
        return userlist.size
    }


    class myViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val Name: TextView = itemView.findViewById(R.id.u_name)
        val Email: TextView = itemView.findViewById(R.id.u_email)
        val Address: TextView = itemView.findViewById(R.id.u_address)
        val Mobileno: TextView = itemView.findViewById(R.id.u_mobno)
        val Gender: TextView = itemView.findViewById(R.id.u_gender)
        val Age: TextView = itemView.findViewById(R.id.u_age)
        val Qualification: TextView = itemView.findViewById(R.id.u_qualification)
        val Fathername: TextView = itemView.findViewById(R.id.u_fname)
        val Dob: TextView = itemView.findViewById(R.id.u_dob)

    }

}