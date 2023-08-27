package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.database.*

class User_flight : AppCompatActivity() {

    private lateinit var db: DatabaseReference
    private lateinit var userRecyclerView: RecyclerView
    private lateinit var flightArrayList: ArrayList<Flight>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_flight)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()

        val bot = findViewById<BottomNavigationView>(R.id.bottomnavigation_user_flight)
        bot.setOnItemReselectedListener {
            when(it.itemId)
            {
                R.id.home->{
                    val intent = Intent(this,User_Home::class.java)
                    intent.putExtra("mobileno",mobilenumber)
                    startActivity(intent)
                }
                R.id.Ticket->{
                    val intent = Intent(this,User_Ticket::class.java)
                    intent.putExtra("mobileno",mobilenumber)
                    startActivity(intent)
                }
                R.id.person->{
                    val intent = Intent(this,User_Profile::class.java)
                    intent.putExtra("mobileno",mobilenumber)
                    startActivity(intent)
                }
            }
        }

        userRecyclerView = findViewById(R.id.flight_list)
        userRecyclerView.layoutManager = LinearLayoutManager(this)
        userRecyclerView.setHasFixedSize(true)

        flightArrayList = arrayListOf<Flight>()
        getFlightData()

    }

    private fun getFlightData() {
        db = FirebaseDatabase.getInstance().getReference("FlightDetails")
        db.addValueEventListener(object: ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                if(snapshot.exists())
                {
                    for(userSnapshot in snapshot.children)
                    {
                        val user = userSnapshot.getValue(Flight::class.java)
                        flightArrayList.add(user!!)
                    }
                    userRecyclerView.adapter = FlightAdapter(flightArrayList)
                }
            }

            override fun onCancelled(error: DatabaseError) {

            }

        })

    }
}