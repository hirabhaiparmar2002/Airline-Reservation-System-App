package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_admin_user_delete.*

class Admin_User_delete : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_user_delete)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()

        val bot = findViewById<BottomNavigationView>(R.id.bottomnavigation_admin_userdelete)
        bot.setOnItemReselectedListener {
            when(it.itemId)
            {
                R.id.User_Read->{
                    val intent = Intent(this,Admin_User_Details::class.java)
                    intent.putExtra("mobileno",mobilenumber)
                    startActivity(intent)
                }
            }
        }

        var user_mobileno = findViewById<TextInputEditText>(R.id.user_delete_mobileno)
        user_delete_delete.setOnClickListener{
            if(user_mobileno.text.toString().isEmpty())
            {
                Toast.makeText(this,"Please Enter Mobile Number",Toast.LENGTH_SHORT).show()
            }
            else
            {
                var database = FirebaseDatabase.getInstance().getReference("User_Data")
                database.child(user_mobileno.text.toString()).removeValue().addOnSuccessListener {
                    user_mobileno.setText("")
                    Toast.makeText(this,"Successfully Deleted",Toast.LENGTH_SHORT).show()
                }.addOnFailureListener{
                    Toast.makeText(this,"Failed to Delete",Toast.LENGTH_SHORT).show()
                }
            }
        }




    }
}