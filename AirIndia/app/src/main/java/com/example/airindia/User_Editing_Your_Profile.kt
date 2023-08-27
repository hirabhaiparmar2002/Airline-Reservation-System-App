package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_user_editing_your_profile.*

class User_Editing_Your_Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_editing_your_profile)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()

        var uname = bundle?.get("name").toString()
        var uemail = bundle?.get("email").toString()
        var udob = bundle?.get("dob").toString()
        var uqualification = bundle?.get("qualification").toString()
        var uaddress = bundle?.get("address").toString()
        var ugender = bundle?.get("gender").toString()
        var ufname = bundle?.get("fname").toString()
        var uage = bundle?.get("age").toString()


        var u_e_name: TextInputEditText = findViewById(R.id.user_editing_name)
        var u_e_email:TextInputEditText = findViewById(R.id.user_editing_email)
        var u_e_dob:TextInputEditText = findViewById(R.id.user_editing_dob)
        var u_e_qualification:TextInputEditText = findViewById(R.id.user_editing_Qualification)
        var u_e_fname:TextInputEditText = findViewById(R.id.user_editing_fname)
        var u_e_address:TextInputEditText = findViewById(R.id.user_editing_address)
        var u_e_age:TextInputEditText = findViewById(R.id.user_editing_age)

        u_e_name.setText(uname)
        u_e_email.setText(uemail)
        u_e_dob.setText(udob)
        u_e_qualification.setText(uqualification)
        u_e_fname.setText(ufname)
        u_e_address.setText(uaddress)
        u_e_age.setText(uage)

        if(ugender.equals("Male"))
        {
            user_male.setChecked(true)
        }
        else if(ugender.equals("Female"))
        {
            user_female.setChecked(true)
        }
        else
        {
            user_other.setChecked(true)
        }

        user_editing_Submit.setOnClickListener({
            if(u_e_name.text.toString().isEmpty() || u_e_email.text.toString().isEmpty() || u_e_address.text.toString().isEmpty()
                || u_e_dob.text.toString().isEmpty() || u_e_fname.text.toString().isEmpty() || u_e_qualification.text.toString().isEmpty() ||
                u_e_age.text.toString().isEmpty())
            {
                Toast.makeText(this,"Please Fill All Details", Toast.LENGTH_SHORT).show()
            }
            else {
                var database = FirebaseDatabase.getInstance().getReference("User_Data")
                database.child(mobilenumber).child("name").setValue(u_e_name.text.toString())
                database.child(mobilenumber).child("email").setValue(u_e_email.text.toString())
                database.child(mobilenumber).child("dob").setValue(u_e_dob.text.toString())
                database.child(mobilenumber).child("address").setValue(u_e_address.text.toString())
                database.child(mobilenumber).child("age").setValue(u_e_age.text.toString())
                database.child(mobilenumber).child("qualification").setValue(u_e_qualification.text.toString())
                database.child(mobilenumber).child("fathername").setValue(u_e_fname.text.toString())
                var ugen = ""
                if (user_male.isChecked)
                {
                    ugen = user_male.text.toString()
                }
                else if(user_female.isChecked)
                {
                    ugen = user_female.text.toString()
                }
                else
                {
                    ugen = user_other.text.toString()
                }

                database.child(mobilenumber).child("gender").setValue(ugen)
                Toast.makeText(this,"Update Successfully", Toast.LENGTH_SHORT).show()
                val intent = Intent(this,User_Your_Profile::class.java)
                intent.putExtra("mobileno",mobilenumber)
                startActivity(intent)
            }
        })

        User_Editing_backarrow.setOnClickListener({
            val intent = Intent(this,User_Your_Profile::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })
    }
}