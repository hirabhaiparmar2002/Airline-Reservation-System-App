package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_forgot_password.*

class Forgot_Password : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        var mobno = findViewById<TextInputEditText>(R.id.forgot_mobno)
        var database = FirebaseDatabase.getInstance().getReference("User_Data")
        var database2 = FirebaseDatabase.getInstance().getReference("Admin_Data")
        var role =""

        Nextstep.setOnClickListener()
        {
            if(mobno.text.toString().isEmpty())
            {
                Toast.makeText(this,"Please Enter Mobile No", Toast.LENGTH_SHORT).show()
            }
            else
            {
                if (admin.isChecked)
                {
                    role = admin.text.toString()
                    database2.child(mobno.text.toString()).get().addOnSuccessListener {
                        if(it.exists())
                        {
                            var intent = Intent(this,Forgot_OTP::class.java)
                            intent.putExtra("mobileno",mobno.text.toString())
                            intent.putExtra("role",role)
                            startActivity(intent)
                        }
                        else
                        {
                            Toast.makeText(this,"Account Does Not Exists", Toast.LENGTH_SHORT).show()
                        }
                    }

                }
                else if (user.isChecked)
                {
                    role = user.text.toString()
                    database.child(mobno.text.toString()).get().addOnSuccessListener {
                        if(it.exists())
                        {
                            var intent = Intent(this,Forgot_OTP::class.java)
                            intent.putExtra("mobileno",mobno.text.toString())
                            intent.putExtra("role",role)
                            startActivity(intent)
                        }
                        else
                        {
                            Toast.makeText(this,"Account Does Not Exists", Toast.LENGTH_SHORT).show()
                        }
                    }

                }
                else {
                    Toast.makeText(this, "Please Select Role", Toast.LENGTH_SHORT).show()
                }
            }
        }


    }
}