package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_admin_flight_booking_details.*

class AdminFlight_BookingDetails : AppCompatActivity() {

    private lateinit var database: DatabaseReference
    private lateinit var adminticketRecyclerView: RecyclerView
    private lateinit var AdminTicketArrayList: ArrayList<Ticket>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_flight_booking_details)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()
        var fno = bundle?.get("fno").toString()

        adminflightbooking_backarrow.setOnClickListener({
            val intent = Intent(this,Admin_Booking_Details::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })

        adminticketRecyclerView = findViewById(R.id.admin_ticketdisplay)
        adminticketRecyclerView.layoutManager = LinearLayoutManager(this)
        adminticketRecyclerView.setHasFixedSize(true)

        AdminTicketArrayList = arrayListOf<Ticket>()
        getAdminTicketData()
    }

    private fun getAdminTicketData() {
        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()
        var fno = bundle?.get("fno").toString()

        database = FirebaseDatabase.getInstance().getReference("TicketDetails")
        database.child(fno).addValueEventListener(object: ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if(snapshot.exists())
                {
                    for(userSnapshot in snapshot.children)
                    {
                        val user = userSnapshot.getValue(Ticket::class.java)
                        AdminTicketArrayList.add(user!!)
                    }
                    adminticketRecyclerView.adapter = AdminFDAdapter(AdminTicketArrayList)
                }
            }
            override fun onCancelled(error: DatabaseError) {

            }
        })
    }
}