package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_admin_notice_delete.*

class Admin_Notice_Delete : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_notice_delete)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()

        Admin_Noticedelete_backarrow.setOnClickListener({
            val intent = Intent(this,Admin_Notice::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })

        var noticeno = findViewById<TextInputEditText>(R.id.notice_delete_id)
        notice_delete_delete.setOnClickListener{
            if(noticeno.text.toString().isEmpty())
            {
                Toast.makeText(this,"Please Enter Notice ID",Toast.LENGTH_SHORT).show()
            }
            else
            {
                var database = FirebaseDatabase.getInstance().getReference("NoticeDetails")
                database.child(noticeno.text.toString()).removeValue().addOnSuccessListener {
                    noticeno.setText("")
                    Toast.makeText(this,"Successfully Deleted",Toast.LENGTH_SHORT).show()
                }.addOnFailureListener{
                    Toast.makeText(this,"Failed to Delete",Toast.LENGTH_SHORT).show()
                }
            }
        }


    }
}