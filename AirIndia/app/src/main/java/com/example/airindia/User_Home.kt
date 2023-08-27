package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.database.*

class User_Home : AppCompatActivity() {

    private lateinit var database: DatabaseReference
    private lateinit var usernoticeRecyclerView: RecyclerView
    private lateinit var UserNoticeArrayList: ArrayList<UserNotice>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_home)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()

        val bot = findViewById<BottomNavigationView>(R.id.bottomnavigation_user_home)
        bot.setOnItemReselectedListener {
            when(it.itemId)
            {
                R.id.flight->{
                    val intent = Intent(this,User_flight::class.java)
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

        usernoticeRecyclerView = findViewById(R.id.user_noticedisplay)
        usernoticeRecyclerView.layoutManager = LinearLayoutManager(this)
        usernoticeRecyclerView.setHasFixedSize(true)

        UserNoticeArrayList = arrayListOf<UserNotice>()
        getUserNoticeData()

    }

    private fun getUserNoticeData() {
        database = FirebaseDatabase.getInstance().getReference("NoticeDetails")
        database.addValueEventListener(object: ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if(snapshot.exists())
                {
                    for(userSnapshot in snapshot.children)
                    {
                        val user = userSnapshot.getValue(UserNotice::class.java)
                        UserNoticeArrayList.add(user!!)
                    }
                    usernoticeRecyclerView.adapter = User_NoticeAdapter(UserNoticeArrayList)
                }
            }
            override fun onCancelled(error: DatabaseError) {

            }
        })

    }
}