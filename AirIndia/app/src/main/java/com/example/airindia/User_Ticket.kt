package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.database.*

class User_Ticket : AppCompatActivity() {

    private lateinit var database: DatabaseReference
    private lateinit var userticketRecyclerView: RecyclerView
    private lateinit var UserTicketArrayList: ArrayList<Ticket>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_ticket)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()

        val bot = findViewById<BottomNavigationView>(R.id.bottomnavigation_user_ticket)
        bot.setOnItemReselectedListener {
            when(it.itemId)
            {
                R.id.home->{
                    val intent = Intent(this,User_Home::class.java)
                    intent.putExtra("mobileno",mobilenumber)
                    startActivity(intent)
                }
                R.id.flight->{
                    val intent = Intent(this,User_flight::class.java)
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
        userticketRecyclerView = findViewById(R.id.user_ticketdisplay)
        userticketRecyclerView.layoutManager = LinearLayoutManager(this)
        userticketRecyclerView.setHasFixedSize(true)

        UserTicketArrayList = arrayListOf<Ticket>()
        getUserTicketData()

    }

    private fun getUserTicketData() {
        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()

        database = FirebaseDatabase.getInstance().getReference("TicketDetails")
        database.child(mobilenumber).addValueEventListener(object: ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if(snapshot.exists())
                {
                    for(userSnapshot in snapshot.children)
                    {
                        val user = userSnapshot.getValue(Ticket::class.java)
                        UserTicketArrayList.add(user!!)
                    }
                    userticketRecyclerView.adapter = TicketAdapter(UserTicketArrayList)
                }
            }
            override fun onCancelled(error: DatabaseError) {

            }
        })

    }
}