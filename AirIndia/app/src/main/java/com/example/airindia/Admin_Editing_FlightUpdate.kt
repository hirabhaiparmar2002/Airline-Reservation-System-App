package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_admin_editing_flight_update.*

class Admin_Editing_FlightUpdate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_editing_flight_update)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()

        var fl_depart = bundle?.get("depart").toString()
        var fl_arrival = bundle?.get("arrival").toString()
        var fl_date = bundle?.get("date").toString()
        var fl_dep_time = bundle?.get("dep_time").toString()
        var fl_arr_time = bundle?.get("arr_time").toString()
        var fl_fno = bundle?.get("fno").toString()
        var fl_seat = bundle?.get("seat").toString()
        var fl_price = bundle?.get("price").toString()

        var f_e_depart:TextInputEditText = findViewById(R.id.flight_editing_depart)
        var f_e_arrival:TextInputEditText = findViewById(R.id.flight_editing_arrival)
        var f_e_date:TextInputEditText = findViewById(R.id.flight_editing_date)
        var f_e_dep_time:TextInputEditText = findViewById(R.id.flight_editing_dep_time)
        var f_e_arr_time:TextInputEditText = findViewById(R.id.flight_editing_arr_time)
        var f_e_fno:TextInputEditText = findViewById(R.id.flight_editing_fno)
        var f_e_seat:TextInputEditText = findViewById(R.id.flight_editing_seat)
        var f_e_price:TextInputEditText = findViewById(R.id.flight_editing_price)

        f_e_depart.setText(fl_depart)
        f_e_arrival.setText(fl_arrival)
        f_e_date.setText(fl_date)
        f_e_dep_time.setText(fl_dep_time)
        f_e_arr_time.setText(fl_arr_time)
        f_e_fno.setText(fl_fno)
        f_e_seat.setText(fl_seat)
        f_e_price.setText(fl_price)

        flight_editing_Submit.setOnClickListener({

            if(f_e_depart.text.toString().isEmpty() || f_e_arrival.text.toString().isEmpty() || f_e_date.text.toString().isEmpty()
                || f_e_dep_time.text.toString().isEmpty() || f_e_arr_time.text.toString().isEmpty() || f_e_fno.text.toString().isEmpty()
                || f_e_seat.text.toString().isEmpty() || f_e_price.text.toString().isEmpty())
            {
                    Toast.makeText(this,"Please Fill All Details", Toast.LENGTH_SHORT).show()
            }
            else
            {
                var database = FirebaseDatabase.getInstance().getReference("FlightDetails")
                database.child(fl_fno).setValue(Flight_Model(f_e_depart.text.toString(),f_e_arrival.text.toString(),
                f_e_date.text.toString(),f_e_dep_time.text.toString(),f_e_arr_time.text.toString(),f_e_fno.text.toString(),
                f_e_seat.text.toString(),f_e_price.text.toString()))

                Toast.makeText(this,"Update Successfully", Toast.LENGTH_SHORT).show()
                val intent = Intent(this,Admin_Flight_Details::class.java)
                intent.putExtra("mobileno",mobilenumber)
                startActivity(intent)
            }
        })

        Flight_Editing_backarrow.setOnClickListener({
            val intent = Intent(this,Admin_Flight_Details::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })

    }
}