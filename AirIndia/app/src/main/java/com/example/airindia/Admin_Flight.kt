package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_admin_flight.*

class Admin_Flight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_flight)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()

        val bot = findViewById<BottomNavigationView>(R.id.bottomnavigation_admin_add_flight)
        bot.setOnItemReselectedListener {
            when(it.itemId)
            {
                R.id.home->{
                    val intent = Intent(this,Admin_Home::class.java)
                    intent.putExtra("mobileno",mobilenumber)
                    startActivity(intent)
                }
                R.id.note->{
                    val intent = Intent(this,Admin_Notice::class.java)
                    intent.putExtra("mobileno",mobilenumber)
                    startActivity(intent)
                }
                R.id.person->{
                    val intent = Intent(this,Admin_Profile::class.java)
                    intent.putExtra("mobileno",mobilenumber)
                    startActivity(intent)
                }
            }
        }

        var flight_depart = findViewById<TextInputEditText>(R.id.admin_flight_depart)
        var flight_arrive = findViewById<TextInputEditText>(R.id.admin_flight_arrive)
        var flight_fno = findViewById<TextInputEditText>(R.id.admin_flight_fno)
        var flight_date = findViewById<TextInputEditText>(R.id.admin_flight_date)
        var flight_dep_time = findViewById<TextInputEditText>(R.id.admin_flight_dep_time)
        var flight_arri_time = findViewById<TextInputEditText>(R.id.admin_flight_arrival_time)
        var seats = findViewById<TextInputEditText>(R.id.admin_flight_seats)
        var flight_seats = findViewById<TextInputEditText>(R.id.admin_flight_seats)
        var flight_price = findViewById<TextInputEditText>(R.id.admin_flight_price)
        admin_flight_submit.setOnClickListener({

            if(flight_depart.text.toString().isEmpty() || flight_arrive.text.toString().isEmpty() || flight_fno.text.toString().isEmpty() || flight_date.text.toString().isEmpty() ||
                flight_dep_time.text.toString().isEmpty() || flight_arri_time.text.toString().isEmpty() ||
                flight_seats.text.toString().isEmpty() || flight_price.text.toString().isEmpty())
            {
                Toast.makeText(this,"Please Fill All The Details",Toast.LENGTH_SHORT).show()
            }
            else
            {
                var flight_d = flight_depart.text.toString()
                var flight_a = flight_arrive.text.toString()
                var flight_da = flight_date.text.toString()
                var flight_d_t = flight_dep_time.text.toString()
                var flight_a_t = flight_arri_time.text.toString()
                var flight_fn = flight_fno.text.toString()
                var flight_se = flight_seats.text.toString()
                var flight_p = flight_price.text.toString()

                var database1 = FirebaseDatabase.getInstance().reference
                database1.child("FlightDetails").child(flight_fno.text.toString()).setValue(Flight_Model(flight_d,flight_a,flight_da,
                flight_d_t,flight_a_t,flight_fn,flight_se,flight_p))

                var database2 = FirebaseDatabase.getInstance().reference
                for(i in 1..32)
                {
                    var s= i.toString();
                    var color = "green"
                    database2.child("BookingDetails").child(flight_fn).child("Seats").child(s).setValue(Booking_Model(s,color))
                }
                Toast.makeText(this,"Flight Add Successfully",Toast.LENGTH_SHORT).show()
                val intent = Intent(this,Admin_Home::class.java)
                intent.putExtra("mobileno",mobilenumber)
                startActivity(intent)
            }

        })


    }
}