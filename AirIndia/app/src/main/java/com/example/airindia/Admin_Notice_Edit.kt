package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_admin_notice_edit.*

class Admin_Notice_Edit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_notice_edit)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()

        noticeupdate_backarrow.setOnClickListener({
            val intent = Intent(this,Admin_Notice::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })

        var noticeno = findViewById<TextInputEditText>(R.id.noticeupdate_noticeno)
        noticeupdate_next.setOnClickListener{
            if(noticeno.text.toString().isEmpty())
            {
                Toast.makeText(this,"Please Enter Notice ID", Toast.LENGTH_SHORT).show()
            }
            else
            {
                var database = FirebaseDatabase.getInstance().getReference("NoticeDetails")
                database.child(noticeno.text.toString()).get().addOnSuccessListener {
                    if(it.exists())
                    {
                        var n_id=it.child("id").value.toString()
                        var n_content=it.child("content").value.toString()

                        val intent = Intent(this,Admin_NoticeEditing::class.java)
                        intent.putExtra("mobileno",mobilenumber)
                        intent.putExtra("id",n_id)
                        intent.putExtra("content",n_content)

                        startActivity(intent)
                    }

                }.addOnFailureListener{
                    Toast.makeText(this,"Failed to Find Notice",Toast.LENGTH_SHORT).show()
                }
            }
        }

    }
}