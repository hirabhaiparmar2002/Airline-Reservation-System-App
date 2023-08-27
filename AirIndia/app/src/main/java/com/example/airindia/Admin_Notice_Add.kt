package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_admin_notice_add.*

class Admin_Notice_Add : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_notice_add)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()

        Admin_NoticeAdd_backarrow.setOnClickListener({
            val intent = Intent(this,Admin_Notice::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })

        var id:TextInputEditText = findViewById(R.id.admin_notice_id)
        var content:TextInputEditText = findViewById(R.id.admin_notice_content)

        admin_notice_Submit.setOnClickListener({

            if(id.text.toString().isEmpty() || content.text.toString().isEmpty())
            {
                Toast.makeText(this,"Please Fill All Details", Toast.LENGTH_SHORT).show()

            }
            else
            {
                var database = FirebaseDatabase.getInstance().getReference("NoticeDetails")
                database.child(id.text.toString()).setValue(Notice_Model(id.text.toString(),content.text.toString()))
                Toast.makeText(this,"Notice Add Successfull", Toast.LENGTH_SHORT).show()
                val intent = Intent(this,Admin_Notice::class.java)
                intent.putExtra("mobileno",mobilenumber)
                startActivity(intent)
            }

        })


    }
}