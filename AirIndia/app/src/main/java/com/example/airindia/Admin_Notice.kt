package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_admin_notice.*

class Admin_Notice : AppCompatActivity() {

    private lateinit var database: DatabaseReference
    private lateinit var adminnoticeRecyclerView: RecyclerView
    private lateinit var NoticeArrayList: ArrayList<Notice>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_notice)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()

        val bot = findViewById<BottomNavigationView>(R.id.bottomnavigation_admin_notice)
        bot.setOnItemReselectedListener {
            when(it.itemId)
            {
                R.id.home->{
                    val intent = Intent(this,Admin_Home::class.java)
                    intent.putExtra("mobileno",mobilenumber)
                    startActivity(intent)
                }
                R.id.flight->{
                    val intent = Intent(this,Admin_Flight::class.java)
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

        notice_delete.setOnClickListener({
            val intent = Intent(this,Admin_Notice_Delete::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })

        notice_add.setOnClickListener({
            val intent = Intent(this,Admin_Notice_Add::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })
        notice_edit.setOnClickListener({
            val intent = Intent(this,Admin_Notice_Edit::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })
        adminnoticeRecyclerView = findViewById(R.id.admin_noticedisplay)
        adminnoticeRecyclerView.layoutManager = LinearLayoutManager(this)
        adminnoticeRecyclerView.setHasFixedSize(true)

        NoticeArrayList = arrayListOf<Notice>()
        getNoticeData()

    }

    private fun getNoticeData() {
        database = FirebaseDatabase.getInstance().getReference("NoticeDetails")
        database.addValueEventListener(object: ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if(snapshot.exists())
                {
                    for(userSnapshot in snapshot.children)
                    {
                        val user = userSnapshot.getValue(Notice::class.java)
                        NoticeArrayList.add(user!!)
                    }
                    adminnoticeRecyclerView.adapter = NoticeAdapter(NoticeArrayList)
                }
            }
            override fun onCancelled(error: DatabaseError) {

            }
        })

    }
}