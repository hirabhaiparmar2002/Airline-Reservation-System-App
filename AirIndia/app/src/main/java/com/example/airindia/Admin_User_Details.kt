package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_admin_user_details.*

class Admin_User_Details : AppCompatActivity() {

    private lateinit var database: DatabaseReference
    private lateinit var userRecycleView: RecyclerView
    private lateinit var userArrayList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_user_details)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()

        val bot = findViewById<BottomNavigationView>(R.id.bottomnavigation_admin_userdata)
        bot.setOnItemReselectedListener {
            when(it.itemId)
            {
                R.id.User_Delete->{
                    val intent = Intent(this,Admin_User_delete::class.java)
                    intent.putExtra("mobileno",mobilenumber)
                    startActivity(intent)
                }
            }
        }

        userdata_backarrow.setOnClickListener({
            val intent = Intent(this,Admin_Profile::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })


        userRecycleView = findViewById(R.id.userlist)
        userRecycleView.layoutManager = LinearLayoutManager(this)
        userRecycleView.setHasFixedSize(true)

        userArrayList = arrayListOf<User>()
        getUserData()

    }

    private fun getUserData() {
        database = FirebaseDatabase.getInstance().getReference("User_Data")

        database.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if(snapshot.exists())
                {
                    for(userSnapshot in snapshot.children)
                    {
                        val user = userSnapshot.getValue(User::class.java)
                        userArrayList.add(user!!)
                    }
                    userRecycleView.adapter = UserAdapter(userArrayList)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })

    }
}