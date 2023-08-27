package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_user_your_profile.*

class User_Your_Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_your_profile)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()

        user_Your_backarrow.setOnClickListener({
            val intent = Intent(this,User_Profile::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })
        
        var u_name: TextView = findViewById(R.id.user_name)
        var u_email:TextView = findViewById(R.id.user_email)
        var u_mobno:TextView = findViewById(R.id.user_mobno)
        var u_dob:TextView = findViewById(R.id.user_dob)
        var u_age:TextView = findViewById(R.id.user_age)
        var u_qualification:TextView = findViewById(R.id.user_qualification)
        var u_address:TextView = findViewById(R.id.user_address)
        var u_fname:TextView = findViewById(R.id.user_fname)
        var u_gender:TextView = findViewById(R.id.user_gender)

        var database = FirebaseDatabase.getInstance().getReference("User_Data")
        database.child(mobilenumber).get().addOnSuccessListener {
            if(it.exists())
            {
                val name = it.child("name").value
                val email = it.child("email").value
                val mobno = it.child("mobileno").value
                val dob = it.child("dob").value
                val age = it.child("age").value
                val qualification = it.child("qualification").value
                val address = it.child("address").value
                val fname = it.child("fathername").value
                val gender = it.child("gender").value

                u_name.text = name.toString()
                u_email.text = email.toString()
                u_mobno.text = mobno.toString()
                u_dob.text = dob.toString()
                u_address.text = address.toString()
                u_age.text = age.toString()
                u_qualification.text = qualification.toString()
                u_fname.text = fname.toString()
                u_gender.text = gender.toString()

            }
        }
        user_edit.setOnClickListener({
            val intent = Intent(this,User_Editing_Your_Profile::class.java)
            intent.putExtra("mobileno",mobilenumber)

            intent.putExtra("name",u_name.text.toString())
            intent.putExtra("email",u_email.text.toString())
            intent.putExtra("dob",u_dob.text.toString())
            intent.putExtra("address",u_address.text.toString())
            intent.putExtra("age",u_age.text.toString())
            intent.putExtra("qualification",u_qualification.text.toString())
            intent.putExtra("fname",u_fname.text.toString())
            intent.putExtra("gender",u_gender.text.toString())
            startActivity(intent)
        })
    }
}