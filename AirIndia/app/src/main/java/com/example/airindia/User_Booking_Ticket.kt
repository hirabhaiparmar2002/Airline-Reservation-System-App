package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_user_booking_ticket.*

class User_Booking_Ticket : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_booking_ticket)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()

        userbooking_backarrow.setOnClickListener({
            val intent = Intent(this,User_Profile::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })

        var flightno = findViewById<TextInputEditText>(R.id.userbooking_flightno)
            booking_next.setOnClickListener{
                if(flightno.text.toString().isEmpty())
                {
                    Toast.makeText(this,"Please Enter Flight Number",Toast.LENGTH_SHORT).show()
                }
                else
                {
                    var database = FirebaseDatabase.getInstance().getReference("FlightDetails")
                    database.child(flightno.text.toString()).get().addOnSuccessListener {
                        if(it.exists())
                        {
                            var f_depart=it.child("flight_depart").value.toString()
                            var f_arrival=it.child("flight_arrival").value.toString()
                            var f_date=it.child("flight_date").value.toString()
                            var f_dep_time=it.child("flight_dep_time").value.toString()
                            var f_arr_time=it.child("flight_arr_time").value.toString()
                            var f_fno=it.child("flight_fno").value.toString()
                            var f_seat=it.child("flight_seat").value.toString()
                            var f_price=it.child("flight_price").value.toString()

                            val intent = Intent(this,User_Book_Seat::class.java)
                            intent.putExtra("mobileno",mobilenumber)
                            intent.putExtra("depart",f_depart)
                            intent.putExtra("arrival",f_arrival)
                            intent.putExtra("date",f_date)
                            intent.putExtra("dep_time",f_dep_time)
                            intent.putExtra("arr_time",f_arr_time)
                            intent.putExtra("fno",flightno.text.toString())
                            intent.putExtra("seat",f_seat)
                            intent.putExtra("price",f_price)
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
            }


    }
}