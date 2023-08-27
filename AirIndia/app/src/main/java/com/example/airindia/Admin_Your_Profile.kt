package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_admin_your_profile.*

class Admin_Your_Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_your_profile)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()

        admin_Your_backarrow.setOnClickListener({
            val intent = Intent(this,Admin_Profile::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })



        var a_name:TextView = findViewById(R.id.admin_name)
        var a_email:TextView = findViewById(R.id.admin_email)
        var a_mobno:TextView = findViewById(R.id.admin_mobno)
        var a_dob:TextView = findViewById(R.id.admin_dob)
        var a_age:TextView = findViewById(R.id.admin_age)
        var a_qualification:TextView = findViewById(R.id.admin_qualification)
        var a_address:TextView = findViewById(R.id.admin_address)
        var a_fname:TextView = findViewById(R.id.admin_fname)
        var a_gender:TextView = findViewById(R.id.admin_gender)

        var database = FirebaseDatabase.getInstance().getReference("Admin_Data")
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

                a_name.text = name.toString()
                a_email.text = email.toString()
                a_mobno.text = mobno.toString()
                a_dob.text = dob.toString()
                a_address.text = address.toString()
                a_age.text = age.toString()
                a_qualification.text = qualification.toString()
                a_fname.text = fname.toString()
                a_gender.text = gender.toString()

            }
        }

        admin_edit.setOnClickListener({
            val intent = Intent(this,Admin_Editing_Your_Profile::class.java)
            intent.putExtra("mobileno",mobilenumber)
            intent.putExtra("name",a_name.text.toString())
            intent.putExtra("email",a_email.text.toString())
            intent.putExtra("dob",a_dob.text.toString())
            intent.putExtra("address",a_address.text.toString())
            intent.putExtra("age",a_age.text.toString())
            intent.putExtra("qualification",a_qualification.text.toString())
            intent.putExtra("fname",a_fname.text.toString())
            intent.putExtra("gender",a_gender.text.toString())
            startActivity(intent)
        })
    }
}