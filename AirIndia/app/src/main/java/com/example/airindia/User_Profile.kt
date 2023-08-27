package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_user_profile.*

class User_Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()

        val bot = findViewById<BottomNavigationView>(R.id.bottomnavigation_user_profile)
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
                R.id.flight->{
                    val intent = Intent(this,User_flight::class.java)
                    intent.putExtra("mobileno",mobilenumber)
                    startActivity(intent)
                }
            }
        }

        user_menu_logout.setOnClickListener({
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        })

        user_menu_changepassword.setOnClickListener({
            val intent = Intent(this, User_ChangePassword::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })

        user_menu_profile.setOnClickListener({
            val intent = Intent(this,User_Your_Profile::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })
        user_menu_booking.setOnClickListener({
            val intent = Intent(this,User_Booking_Ticket::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })
        user_menu_Cancellation.setOnClickListener({
            val intent = Intent(this,User_Ticket_Cancellation::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })

    }
}