package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_admin_profile.*

class Admin_Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_profile)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()

        val bot = findViewById<BottomNavigationView>(R.id.bottomnavigation_admin_profile)
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
                R.id.flight->{
                    val intent = Intent(this,Admin_Flight::class.java)
                    intent.putExtra("mobileno",mobilenumber)
                    startActivity(intent)
                }
            }
        }

        admin_menu_changepassword.setOnClickListener({
            val intent = Intent(this,Admin_ChangePassword::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })

        admin_menu_logout.setOnClickListener({
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        })

        admin_menu_profile.setOnClickListener({
            val intent = Intent(this,Admin_Your_Profile::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })
        admin_menu_user_details.setOnClickListener({
            val intent = Intent(this,Admin_User_Details::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })
        admin_menu_flight_details.setOnClickListener({
            val intent = Intent(this,Admin_Flight_Details::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })
        admin_menu_booking_details.setOnClickListener({
            val intent = Intent(this,Admin_Booking_Details::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })

    }
}