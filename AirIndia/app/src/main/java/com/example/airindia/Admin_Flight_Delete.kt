package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_admin_flight_delete.*

class Admin_Flight_Delete : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_flight_delete)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()

        val bot = findViewById<BottomNavigationView>(R.id.bottomnavigation_admin_flightdelete)
        bot.setOnItemReselectedListener {
            when(it.itemId)
            {
                R.id.Flight_Update->{
                    val intent = Intent(this,Admin_Flight_Details::class.java)
                    intent.putExtra("mobileno",mobilenumber)
                    startActivity(intent)
                }
            }
        }

        var flightno = findViewById<TextInputEditText>(R.id.flight_delete_flightno)
        flight_delete_delete.setOnClickListener{
            if(flightno.text.toString().isEmpty())
            {
                Toast.makeText(this,"Please Enter Flight Number",Toast.LENGTH_SHORT).show()
            }
            else
            {
                var database = FirebaseDatabase.getInstance().getReference("FlightDetails")
                database.child(flightno.text.toString()).removeValue().addOnSuccessListener {
                    flightno.setText("")

                    var database1 = FirebaseDatabase.getInstance().getReference("TicketDetails")
                    database1.child(flightno.text.toString()).removeValue().addOnSuccessListener {  }

                    var database2 = FirebaseDatabase.getInstance().getReference("BookingDetails")
                    database2.child(flightno.text.toString()).removeValue().addOnSuccessListener {  }

                    Toast.makeText(this,"Successfully Deleted",Toast.LENGTH_SHORT).show()
                }.addOnFailureListener{
                    Toast.makeText(this,"Failed to Delete",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}