package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_admin_editing_your_profile.*

class Admin_Editing_Your_Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_editing_your_profile)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()
        var aname = bundle?.get("name").toString()
        var aemail = bundle?.get("email").toString()
        var adob = bundle?.get("dob").toString()
        var aqualification = bundle?.get("qualification").toString()
        var aaddress = bundle?.get("address").toString()
        var agender = bundle?.get("gender").toString()
        var afname = bundle?.get("fname").toString()
        var aage = bundle?.get("age").toString()


        var a_e_name:TextInputEditText = findViewById(R.id.admin_editing_name)
        var a_e_email:TextInputEditText = findViewById(R.id.admin_editing_email)
        var a_e_dob:TextInputEditText = findViewById(R.id.admin_editing_dob)
        var a_e_qualification:TextInputEditText = findViewById(R.id.admin_editing_Qualification)
        var a_e_fname:TextInputEditText = findViewById(R.id.admin_editing_fname)
        var a_e_address:TextInputEditText = findViewById(R.id.admin_editing_address)
        var a_e_age:TextInputEditText = findViewById(R.id.admin_editing_age)

        a_e_name.setText(aname)
        a_e_email.setText(aemail)
        a_e_dob.setText(adob)
        a_e_qualification.setText(aqualification)
        a_e_fname.setText(afname)
        a_e_address.setText(aaddress)
        a_e_age.setText(aage)

        if(agender.equals("Male"))
        {
            admin_male.setChecked(true)
        }
        else if(agender.equals("Female"))
        {
            admin_female.setChecked(true)
        }
        else
        {
            admin_other.setChecked(true)
        }

        admin_editing_Submit.setOnClickListener({
            if(a_e_name.text.toString().isEmpty() || a_e_email.text.toString().isEmpty() || a_e_address.text.toString().isEmpty()
                || a_e_dob.text.toString().isEmpty() || a_e_fname.text.toString().isEmpty() || a_e_qualification.text.toString().isEmpty() ||
                    a_e_age.text.toString().isEmpty())
            {
                Toast.makeText(this,"Please Fill All Details", Toast.LENGTH_SHORT).show()
            }
            else {
                var database = FirebaseDatabase.getInstance().getReference("Admin_Data")
                database.child(mobilenumber).child("name").setValue(a_e_name.text.toString())
                database.child(mobilenumber).child("email").setValue(a_e_email.text.toString())
                database.child(mobilenumber).child("dob").setValue(a_e_dob.text.toString())
                database.child(mobilenumber).child("address").setValue(a_e_address.text.toString())
                database.child(mobilenumber).child("age").setValue(a_e_age.text.toString())
                database.child(mobilenumber).child("qualification").setValue(a_e_qualification.text.toString())
                database.child(mobilenumber).child("fathername").setValue(a_e_fname.text.toString())
                var gen = ""
                if (admin_male.isChecked)
                {
                    gen = admin_male.text.toString()
                }
                else if(admin_female.isChecked)
                {
                    gen = admin_female.text.toString()
                }
                else
                {
                    gen = admin_other.text.toString()
                }

                database.child(mobilenumber).child("gender").setValue(gen)
                Toast.makeText(this,"Update Successfully", Toast.LENGTH_SHORT).show()
                val intent = Intent(this,Admin_Your_Profile::class.java)
                intent.putExtra("mobileno",mobilenumber)
                startActivity(intent)
            }
        })

        Admin_Editing_backarrow.setOnClickListener({
            val intent = Intent(this,Admin_Your_Profile::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })

    }
}