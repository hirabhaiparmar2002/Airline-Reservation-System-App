package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_admin_booking_details.*

class Admin_Booking_Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_booking_details)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()

        adminbookingdetails_backarrow.setOnClickListener({
            val intent = Intent(this,Admin_Profile::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })

        var flightno = findViewById<TextInputEditText>(R.id.adminbooking_flightno)
        adminbooking_next.setOnClickListener({
            if(flightno.text.toString().isEmpty())
            {
                Toast.makeText(this,"Failed to Find Flight",Toast.LENGTH_SHORT).show()
            }
            else
            {
                var database = FirebaseDatabase.getInstance().getReference("FlightDetails")
                database.child(flightno.text.toString()).get().addOnSuccessListener {
                    if(it.exists())
                    {
                        var f_fno=it.child("flight_fno").value.toString()

                        val intent = Intent(this,AdminFlight_BookingDetails::class.java)
                        intent.putExtra("mobileno",mobilenumber)
                        intent.putExtra("fno",flightno.text.toString())
                        startActivity(intent)
                    }
                    else
                    {
                        Toast.makeText(this,"Failed to Find Flight",Toast.LENGTH_SHORT).show()
                    }

                }.addOnFailureListener{
                    Toast.makeText(this,"Failed to Find Flight",Toast.LENGTH_SHORT).show()
                }
            }
        })

    }
}