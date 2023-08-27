package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_user_booking_details.*

class User_Booking_Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_booking_details)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()
        var sno = bundle?.get("seatno").toString()
        var fno = bundle?.get("flightno").toString()

        var uname:TextInputEditText = findViewById(R.id.user_reg_name)
        var urmobileno:TextInputEditText = findViewById(R.id.user_reg_mobno)

        var ugender ="";
        var upassport:TextInputEditText = findViewById(R.id.user_reg_passport)
        var uage:TextInputEditText = findViewById(R.id.user_reg_age)
        if (umale.isChecked)
        {
            ugender = umale.text.toString()
        }
        else if(ufemale.isChecked)
        {
            ugender = ufemale.text.toString()
        }
        else
        {
            ugender = uother.text.toString()
        }

        bookingdetails_next.setOnClickListener({
            if(uname.text.toString().isEmpty() || urmobileno.text.toString().isEmpty() || upassport.text.toString().isEmpty() ||
                uage.text.toString().isEmpty())
            {
                Toast.makeText(this,"Please Fill All Details", Toast.LENGTH_SHORT).show()
            }
            else
            {
                var database = FirebaseDatabase.getInstance().getReference("FlightDetails")
                database.child(fno).get().addOnSuccessListener {
                    if(it.exists())
                    {
                        var fb_depart=it.child("flight_depart").value.toString()
                        var fb_arrival=it.child("flight_arrival").value.toString()
                        var fb_date=it.child("flight_date").value.toString()
                        var fb_dep_time=it.child("flight_dep_time").value.toString()
                        var fb_arr_time=it.child("flight_arr_time").value.toString()
                        var fb_fno=it.child("flight_fno").value.toString()
                        var fb_seat=it.child("flight_seat").value.toString()
                        var fb_price=it.child("flight_price").value.toString()

                        val intent = Intent(this,User_Booking_Payment::class.java)
                        intent.putExtra("mobileno",mobilenumber)
                        intent.putExtra("seatno",sno)
                        intent.putExtra("flightno",fno)
                        intent.putExtra("name",uname.text.toString())
                        intent.putExtra("gender",ugender)
                        intent.putExtra("rmobileno",urmobileno.text.toString())
                        intent.putExtra("passport",upassport.text.toString())
                        intent.putExtra("age",uage.text.toString())
                        intent.putExtra("depart",fb_depart)
                        intent.putExtra("arrival",fb_arrival)
                        intent.putExtra("flightdate",fb_date)
                        intent.putExtra("deptime",fb_dep_time)
                        intent.putExtra("arrtime",fb_arr_time)
                        intent.putExtra("totalseat",fb_seat)
                        intent.putExtra("price",fb_price)
                        startActivity(intent)
                    }
                }
            }
        })

        userbookingdetails_backarrow.setOnClickListener({
            val intent = Intent(this,User_Book_Seat::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })
    }
}