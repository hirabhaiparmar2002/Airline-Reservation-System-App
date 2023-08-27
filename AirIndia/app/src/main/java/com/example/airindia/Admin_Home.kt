package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.database.*

class Admin_Home : AppCompatActivity() {

    private lateinit var database: DatabaseReference
    private lateinit var userflightRecyclerView: RecyclerView
    private lateinit var flightArrayList: ArrayList<Flight>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_home)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()

        val bot = findViewById<BottomNavigationView>(R.id.bottomnavigation_admin_home_flight)
        bot.setOnItemReselectedListener {
            when(it.itemId)
            {
                R.id.flight->{
                    val intent = Intent(this,Admin_Flight::class.java)
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


        userflightRecyclerView = findViewById(R.id.admin_flightdisplay)
        userflightRecyclerView.layoutManager = LinearLayoutManager(this)
        userflightRecyclerView.setHasFixedSize(true)

        flightArrayList = arrayListOf<Flight>()
        getFlightData()

    }

    private fun getFlightData() {
        database = FirebaseDatabase.getInstance().getReference("FlightDetails")
        database.addValueEventListener(object: ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if(snapshot.exists())
                {
                    for(userSnapshot in snapshot.children)
                    {
                        val user = userSnapshot.getValue(Flight::class.java)
                        flightArrayList.add(user!!)
                    }
                    userflightRecyclerView.adapter = FlightAdapter(flightArrayList)
                }
            }

            override fun onCancelled(error: DatabaseError) {

            }

        })

    }
}