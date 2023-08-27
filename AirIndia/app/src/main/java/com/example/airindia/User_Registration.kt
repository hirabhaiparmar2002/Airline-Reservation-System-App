package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_user_registration.*

class User_Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_registration)

        login.setOnClickListener({
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        })
        var male = findViewById<RadioButton>(R.id.male)
        var female = findViewById<RadioButton>(R.id.female)
        var other = findViewById<RadioButton>(R.id.other)
        var database = FirebaseDatabase.getInstance().reference
        var database1 = FirebaseDatabase.getInstance().getReference("User_Data")


        user_signup.setOnClickListener{
            if(user_reg_name.text.toString().isEmpty() || user_reg_email.text.toString().isEmpty()||user_reg_mobno.text.toString().isEmpty()||
                user_reg_address.text.toString().isEmpty()||user_reg_age.text.toString().isEmpty()||user_reg_qualification.text.toString().isEmpty()
                ||user_reg_fathername.text.toString().isEmpty()||user_reg_dob.text.toString().isEmpty()||user_reg_pass.text.toString().isEmpty()
                ||user_reg_confirmpass.text.toString().isEmpty())
            {
                Toast.makeText(this,"Please Fill All Details", Toast.LENGTH_SHORT).show()
            }
            else
            {
                var gender = ""
                var name = user_reg_name.text.toString()
                var email = user_reg_email.text.toString()
                var mobileno = user_reg_mobno.text.toString()
                var address = user_reg_address.text.toString()
                if (male.isChecked)
                {
                    gender = male.text.toString()
                }
                else if(female.isChecked)
                {
                    gender = female.text.toString()
                }
                else
                {
                    gender = other.text.toString()
                }
                var age = user_reg_age.text.toString()
                var Qualification = user_reg_qualification.text.toString()
                var fathername = user_reg_fathername.text.toString()
                var dob = user_reg_dob.text.toString()
                var password = user_reg_pass.text.toString()
                var confirmpassword = user_reg_confirmpass.text.toString()
                var role="User"

                database1.child(mobileno).get().addOnSuccessListener {
                    if(it.exists())
                    {
                        Toast.makeText(this,"Registration Already Done", Toast.LENGTH_SHORT).show()
                    }
                    else
                    {
                        if(password.equals(confirmpassword))
                        {
                        database.child("User_Data").child(mobileno).setValue(User_Model(name,email,mobileno,address,gender,Qualification,age,fathername,dob,password, confirmpassword,role))
                        Toast.makeText(this,"Registration Successfull", Toast.LENGTH_SHORT).show()
                            var intent = Intent(this,MainActivity::class.java)
                            startActivity(intent)
                        }
                        else
                        {
                            Toast.makeText(this,"Password and Confirm Password Does Not match", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        }
    }
}