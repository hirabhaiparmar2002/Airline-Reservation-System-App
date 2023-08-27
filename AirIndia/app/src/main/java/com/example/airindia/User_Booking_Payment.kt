package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_user_booking_payment.*

class User_Booking_Payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_booking_payment)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()
        var sno = bundle?.get("seatno").toString()
        var fno = bundle?.get("flightno").toString()
        var uname = bundle?.get("name").toString()
        var urmobileno = bundle?.get("rmobileno").toString()
        var upassport = bundle?.get("passport").toString()
        var ugender = bundle?.get("gender").toString()
        var uage = bundle?.get("age").toString()

        var depart = bundle?.get("depart").toString()
        var arrival = bundle?.get("arrival").toString()
        var date = bundle?.get("flightdate").toString()
        var departtime = bundle?.get("deptime").toString()
        var arrivaltime = bundle?.get("arrtime").toString()
        var totalseat = bundle?.get("totalseat").toString()
        var price = bundle?.get("price").toString()

        var ticketno = fno+"_"+sno
        var bookingdate = "22/11/2022"

        var updateprice=price.toInt()*80;
        var a:Int = (price.toInt()*80)/100;
        var gst = a*18;
        var totalamt = updateprice + gst;
        var remaining = totalseat.toInt() - 1;

        pseatprice.setText(updateprice.toString())
        pgstprice.setText(gst.toString())
        ptotalamt.setText(totalamt.toString())
        var seatnumber = 0;

        for(i in 1..32)
        {
            if(sno == "s"+i)
            {
                seatnumber = i;
            }
        }

        var ucname:EditText = findViewById(R.id.paymentname)
        var ucnumber:EditText = findViewById(R.id.paymentcardnumber)
        var ucexpirydate:EditText = findViewById(R.id.paymentexpirydate)
        var uccvv:EditText = findViewById(R.id.paymentcvvno)

        finalBookSeat.setOnClickListener({
            if(ucname.text.toString().isEmpty() || ucnumber.text.toString().isEmpty() || ucexpirydate.text.toString().isEmpty() ||
                uccvv.text.toString().isEmpty())
            {
                Toast.makeText(this,"Please Fill Payment Details", Toast.LENGTH_SHORT).show()
            }
            else
            {
                var db1 = FirebaseDatabase.getInstance().getReference("BookingDetails")
                db1.child(fno).child("Seats").child(seatnumber.toString()).child("color").setValue("red")

                var db2 = FirebaseDatabase.getInstance().getReference("FlightDetails")
                db2.child(fno).child("flight_seat").setValue(remaining.toString())

                var db3 = FirebaseDatabase.getInstance().reference
                db3.child("TicketDetails").child(mobilenumber).child(ticketno).
                setValue(Ticket_Model(uname,sno,fno,urmobileno,upassport,ugender,uage,depart,arrival,date,departtime,arrivaltime,totalamt.toString(),ticketno,bookingdate))

                var db4 = FirebaseDatabase.getInstance().reference
                db4.child("TicketDetails").child(fno).child(ticketno).
                setValue(Ticket_Model(uname,sno,fno,urmobileno,upassport,ugender,uage,depart,arrival,date,departtime,arrivaltime,totalamt.toString(),ticketno,bookingdate))

                Toast.makeText(this,"Ticket Booked Successfully", Toast.LENGTH_SHORT).show()
                val intent = Intent(this,User_Profile::class.java)
                intent.putExtra("mobileno",mobilenumber)
                startActivity(intent)
            }
        })
    }
}