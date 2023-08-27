package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_user_ticket_cancellation.*

class User_Ticket_Cancellation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_ticket_cancellation)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()

        var fno:TextInputEditText = findViewById(R.id.ticketcancel_flightno)
        var sno:TextInputEditText = findViewById(R.id.ticketcancel_seatno)
        var tno:TextInputEditText = findViewById(R.id.ticketcancel_ticketno)

        ticket_delete.setOnClickListener({

            if(fno.text.toString().isEmpty() || sno.text.toString().isEmpty())
            {
                Toast.makeText(this,"Please Fill All Details", Toast.LENGTH_SHORT).show()
            }
            else
            {

                var db1 = FirebaseDatabase.getInstance().getReference("TicketDetails")
                db1.child(mobilenumber).child(tno.text.toString()).removeValue().addOnSuccessListener {

                    var db2 = FirebaseDatabase.getInstance().getReference("TicketDetails")
                    db2.child(fno.text.toString()).child(tno.text.toString()).removeValue().addOnSuccessListener {

                        var database = FirebaseDatabase.getInstance().getReference("FlightDetails")
                        database.child(fno.text.toString()).get().addOnSuccessListener {
                            if(it.exists())
                            {
                                var totalseat = it.child("flight_seat").value.toString()
                                var remaining = totalseat.toInt() + 1;
                                var db3 = FirebaseDatabase.getInstance().getReference("FlightDetails")
                                db3.child(fno.text.toString()).child("flight_seat").setValue(remaining.toString())
                                var seatnumber = 0;
                                for(k in 1..32)
                                {
                                    if(sno.text.toString() == "s"+k)
                                    {
                                        seatnumber = k;
                                    }
                                }
                                var db4 = FirebaseDatabase.getInstance().getReference("BookingDetails")
                                db4.child(fno.text.toString()).child("Seats").child(seatnumber.toString()).child("color").setValue("green")

                                Toast.makeText(this,"Flight Cancelled Sucessfully",Toast.LENGTH_SHORT).show()
                                val intent = Intent(this,User_Profile::class.java)
                                intent.putExtra("mobileno",mobilenumber)
                                startActivity(intent)
                            }
                        }

                    }.addOnFailureListener{
                        Toast.makeText(this,"Failed to Find TicketNo In Flights",Toast.LENGTH_SHORT).show()
                    }

                }.addOnFailureListener{
                    Toast.makeText(this,"Failed to Find Flight In Registered Mobile Number",Toast.LENGTH_SHORT).show()
                }
            }
        })

        user_cancelledticket_backarrow.setOnClickListener({
            val intent = Intent(this,User_Profile::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })
    }
}