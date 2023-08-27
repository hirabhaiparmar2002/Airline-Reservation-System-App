package com.example.airindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_admin_notice_editing.*

class Admin_NoticeEditing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_notice_editing)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()
        var notice_id = bundle?.get("id").toString()
        var notice_content = bundle?.get("content").toString()

        var nid:TextInputEditText = findViewById(R.id.noticeediting_id)
        var ncontent:TextInputEditText = findViewById(R.id.noticeediting_content)

        nid.setText(notice_id)
        ncontent.setText(notice_content)

        noticeediting_Submit.setOnClickListener({
            if(nid.text.toString().isEmpty() || ncontent.text.toString().isEmpty())
            {
                Toast.makeText(this,"Please Fill All Details", Toast.LENGTH_SHORT).show()
            }
            else
            {
                var database = FirebaseDatabase.getInstance().getReference("NoticeDetails")
                database.child(nid.text.toString()).setValue(Notice_Model(nid.text.toString(),ncontent.text.toString()))
                Toast.makeText(this,"Update Successfully", Toast.LENGTH_SHORT).show()
                val intent = Intent(this,Admin_Notice::class.java)
                intent.putExtra("mobileno",mobilenumber)
                startActivity(intent)
            }
        })
        NoticeEditing_backarrow.setOnClickListener({
            val intent = Intent(this,Admin_Notice_Edit::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })

    }
}