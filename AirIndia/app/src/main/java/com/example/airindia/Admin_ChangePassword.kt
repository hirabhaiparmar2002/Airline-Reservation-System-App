package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_admin_change_password.*

class Admin_ChangePassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_change_password)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()

        var database = FirebaseDatabase.getInstance().getReference("Admin_Data")

        var currentpassword = findViewById<TextInputEditText>(R.id.admin_menu_currentPassword)
        var newpassword = findViewById<TextInputEditText>(R.id.admin_menu_newPassword)
        var confirmpassword = findViewById<TextInputEditText>(R.id.admin_menu_confirmPassword)

        admin_save.setOnClickListener({
            if(currentpassword.text.toString().isEmpty() || newpassword.text.toString().isEmpty() || confirmpassword.text.toString().isEmpty())
            {
                Toast.makeText(this,"Please Fill the details", Toast.LENGTH_SHORT).show()
            }
            else
            {
                var database2 = FirebaseDatabase.getInstance().getReference("Admin_Data")
                database2.child(mobilenumber).get().addOnSuccessListener {
                    if(it.exists())
                    {
                        val cpassword = it.child("password").value.toString()

                        if(cpassword.equals(currentpassword.text.toString()))
                        {
                            if(newpassword.text.toString().equals(confirmpassword.text.toString()))
                            {

                                database.child(mobilenumber).child("password").setValue(newpassword.text.toString())
                                database.child(mobilenumber).child("confirmpassword").setValue(confirmpassword.text.toString())
                                Toast.makeText(this,"New Password Update Successfully", Toast.LENGTH_SHORT).show()
                                var intent = Intent(this,Admin_Profile::class.java)
                                intent.putExtra("mobileno",mobilenumber)
                                startActivity(intent)
                            }
                            else
                            {
                                Toast.makeText(this,"New Password & Confirm Password Does not Match", Toast.LENGTH_SHORT).show()
                            }
                        }
                        else
                        {
                            Toast.makeText(this,"Current Password Not Matched",Toast.LENGTH_SHORT).show()
                        }
                    }
                    else
                    {
                        Toast.makeText(this,"Try Again Later",Toast.LENGTH_SHORT).show()
                    }
                }
            }
        })

        admin_changepassword_backarrow.setOnClickListener({
            val intent = Intent(this,Admin_Profile::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })
    }
}