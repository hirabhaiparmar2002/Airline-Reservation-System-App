package com.example.airindia

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_user_book_seat.*

class User_Book_Seat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_book_seat)

        var bundle: Bundle? =intent.extras
        var mobilenumber = bundle?.get("mobileno").toString()

        var fl_depart = bundle?.get("depart").toString()
        var fl_arrival = bundle?.get("arrival").toString()
        var fl_date = bundle?.get("date").toString()
        var fl_dep_time = bundle?.get("dep_time").toString()
        var fl_arr_time = bundle?.get("arr_time").toString()
        var fl_fno = bundle?.get("fno").toString()
        var fl_seat = bundle?.get("seat").toString()
        var fl_price = bundle?.get("price").toString()

        book_depart.setText(fl_depart)
        book_arrival.setText(fl_arrival)
        book_flightno.setText(fl_fno)
        book_ticketprice.setText(fl_price)
        book_dept_time.setText(fl_dep_time)
        book_arrival_time.setText(fl_arr_time)
        book_date.setText(fl_date)
        book_seatno.setText("0")

        var se1:String?=null;
        var se2:String?=null;
        var se3:String?=null;
        var se4:String?=null;
        var se5:String?=null;
        var se6:String?=null;
        var se7:String?=null;
        var se8:String?=null;
        var se9:String?=null;
        var se10:String?=null;
        var se11:String?=null;
        var se12:String?=null;
        var se13:String?=null;
        var se14:String?=null;
        var se15:String?=null;
        var se16:String?=null;
        var se17:String?=null;
        var se18:String?=null;
        var se19:String?=null;
        var se20:String?=null;
        var se21:String?=null;
        var se22:String?=null;
        var se23:String?=null;
        var se24:String?=null;
        var se25:String?=null;
        var se26:String?=null;
        var se27:String?=null;
        var se28:String?=null;
        var se29:String?=null;
        var se30:String?=null;
        var se31:String?=null;
        var se32:String?=null;


        var database = FirebaseDatabase.getInstance().getReference("BookingDetails")
        database.child(fl_fno).child("Seats").child("1").get().addOnSuccessListener {
            if(it.exists())
            {
                se1 = it.child("color").value.toString()
                if(se1 == "red")
                {
                    s1.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("2").get().addOnSuccessListener {
            if(it.exists())
            {
                se2 = it.child("color").value.toString()
                if(se2 == "red")
                {
                    s2.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("3").get().addOnSuccessListener {
            if(it.exists())
            {
                se3 = it.child("color").value.toString()
                if(se3 == "red")
                {
                    s3.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("4").get().addOnSuccessListener {
            if(it.exists())
            {
                se4 = it.child("color").value.toString()
                if(se4 == "red")
                {
                    s4.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("5").get().addOnSuccessListener {
            if(it.exists())
            {
                se5 = it.child("color").value.toString()
                if(se5 == "red")
                {
                    s5.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("6").get().addOnSuccessListener {
            if(it.exists())
            {
                se6 = it.child("color").value.toString()
                if(se6 == "red")
                {
                    s6.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("7").get().addOnSuccessListener {
            if(it.exists())
            {
                se7 = it.child("color").value.toString()
                if(se7 == "red")
                {
                    s7.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("8").get().addOnSuccessListener {
            if(it.exists())
            {
                se8 = it.child("color").value.toString()
                if(se8 == "red")
                {
                    s8.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("9").get().addOnSuccessListener {
            if(it.exists())
            {
                se9 = it.child("color").value.toString()
                if(se9 == "red")
                {
                    s9.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("10").get().addOnSuccessListener {
            if(it.exists())
            {
                se10 = it.child("color").value.toString()
                if(se10 == "red")
                {
                    s10.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("11").get().addOnSuccessListener {
            if(it.exists())
            {
                se11 = it.child("color").value.toString()
                if(se11 == "red")
                {
                    s11.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("12").get().addOnSuccessListener {
            if(it.exists())
            {
                se12 = it.child("color").value.toString()
                if(se12 == "red")
                {
                    s12.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("13").get().addOnSuccessListener {
            if(it.exists())
            {
                se13 = it.child("color").value.toString()
                if(se13 == "red")
                {
                    s13.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("14").get().addOnSuccessListener {
            if(it.exists())
            {
                se14 = it.child("color").value.toString()
                if(se14 == "red")
                {
                    s14.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("15").get().addOnSuccessListener {
            if(it.exists())
            {
                se15 = it.child("color").value.toString()
                if(se15 == "red")
                {
                    s15.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("16").get().addOnSuccessListener {
            if(it.exists())
            {
                se16 = it.child("color").value.toString()
                if(se16 == "red")
                {
                    s16.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("17").get().addOnSuccessListener {
            if(it.exists())
            {
                se17 = it.child("color").value.toString()
                if(se17 == "red")
                {
                    s17.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("18").get().addOnSuccessListener {
            if(it.exists())
            {
                se18 = it.child("color").value.toString()
                if(se18 == "red")
                {
                    s18.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("19").get().addOnSuccessListener {
            if(it.exists())
            {
                se19 = it.child("color").value.toString()
                if(se19 == "red")
                {
                    s19.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("20").get().addOnSuccessListener {
            if(it.exists())
            {
                se20 = it.child("color").value.toString()
                if(se20 == "red")
                {
                    s20.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("21").get().addOnSuccessListener {
            if(it.exists())
            {
                se21 = it.child("color").value.toString()
                if(se21 == "red")
                {
                    s21.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("22").get().addOnSuccessListener {
            if(it.exists())
            {
                se22 = it.child("color").value.toString()
                if(se22 == "red")
                {
                    s22.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("23").get().addOnSuccessListener {
            if(it.exists())
            {
                se23 = it.child("color").value.toString()
                if(se23 == "red")
                {
                    s23.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("24").get().addOnSuccessListener {
            if(it.exists())
            {
                se24 = it.child("color").value.toString()
                if(se24 == "red")
                {
                    s24.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("25").get().addOnSuccessListener {
            if(it.exists())
            {
                se25 = it.child("color").value.toString()
                if(se25 == "red")
                {
                    s25.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("26").get().addOnSuccessListener {
            if(it.exists())
            {
                se26 = it.child("color").value.toString()
                if(se26 == "red")
                {
                    s26.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("27").get().addOnSuccessListener {
            if(it.exists())
            {
                se27 = it.child("color").value.toString()
                if(se27 == "red")
                {
                    s27.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("28").get().addOnSuccessListener {
            if(it.exists())
            {
                se28 = it.child("color").value.toString()
                if(se28 == "red")
                {
                    s28.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("29").get().addOnSuccessListener {
            if(it.exists())
            {
                se29 = it.child("color").value.toString()
                if(se29 == "red")
                {
                    s29.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("30").get().addOnSuccessListener {
            if(it.exists())
            {
                se30 = it.child("color").value.toString()
                if(se30 == "red")
                {
                    s30.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("31").get().addOnSuccessListener {
            if(it.exists())
            {
                se31 = it.child("color").value.toString()
                if(se31 == "red")
                {
                    s31.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }
        database.child(fl_fno).child("Seats").child("32").get().addOnSuccessListener {
            if(it.exists())
            {
                se32 = it.child("color").value.toString()
                if(se32 == "red")
                {
                    s32.setColorFilter(Color.argb(255,255,0,0))
                }
            }
        }





        s1.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se1 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s1.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s1")
            }
            else if(seat != "0" && seat.equals("s1"))
            {
                s1.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s1.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s1")

                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}

            }
        })
        s2.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se2 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s2.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s2")
            }
            else if(seat != "0" && seat.equals("s2"))
            {
                s2.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s2.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s2")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })

        s3.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se3 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s3.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s3")
            }
            else if(seat != "0" && seat.equals("s3"))
            {
                s3.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s3.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s3")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })

        s4.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se4 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s4.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s4")
            }
            else if(seat != "0" && seat.equals("s4"))
            {
                s4.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s4.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s4")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })

        s5.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se5 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s5.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s5")
            }
            else if(seat != "0" && seat.equals("s5"))
            {
                s5.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s5.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s5")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })

        s6.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se6 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s6.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s6")
            }
            else if(seat != "0" && seat.equals("s6"))
            {
                s6.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s6.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s6")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s7.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se7 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s7.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s7")
            }
            else if(seat != "0" && seat.equals("s7"))
            {
                s7.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s7.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s7")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s8.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se8 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s8.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s8")
            }
            else if(seat != "0" && seat.equals("s8"))
            {
                s8.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s8.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s8")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s9.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se9 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s9.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s9")
            }
            else if(seat != "0" && seat.equals("s9"))
            {
                s9.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s9.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s9")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s10.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se10 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s10.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s10")
            }
            else if(seat != "0" && seat.equals("s10"))
            {
                s10.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s10.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s10")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s11.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se11 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s11.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s11")
            }
            else if(seat != "0" && seat.equals("s11"))
            {
                s11.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s11.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s11")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s12.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se12 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s12.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s12")
            }
            else if(seat != "0" && seat.equals("s12"))
            {
                s12.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s12.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s12")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s13.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se13 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s13.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s13")
            }
            else if(seat != "0" && seat.equals("s13"))
            {
                s13.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s13.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s13")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s14.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se14 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s14.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s14")
            }
            else if(seat != "0" && seat.equals("s14"))
            {
                s14.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s14.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s14")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s15.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se15 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s15.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s15")
            }
            else if(seat != "0" && seat.equals("s15"))
            {
                s15.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s15.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s15")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s16.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se16 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s16.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s16")
            }
            else if(seat != "0" && seat.equals("s16"))
            {
                s16.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s16.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s16")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s17.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se17 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s17.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s17")
            }
            else if(seat != "0" && seat.equals("s17"))
            {
                s17.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s17.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s17")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s18.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se18 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s18.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s18")
            }
            else if(seat != "0" && seat.equals("s18"))
            {
                s18.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s18.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s18")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s19.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se19 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s19.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s19")
            }
            else if(seat != "0" && seat.equals("s19"))
            {
                s19.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s19.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s19")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s20.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se20 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s20.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s20")
            }
            else if(seat != "0" && seat.equals("s20"))
            {
                s20.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s20.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s20")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s21.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se21 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s21.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s21")
            }
            else if(seat != "0" && seat.equals("s21"))
            {
                s21.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s21.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s21")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s22.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se22 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s22.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s22")
            }
            else if(seat != "0" && seat.equals("s22"))
            {
                s22.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s22.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s22")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s23.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se23 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s23.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s23")
            }
            else if(seat != "0" && seat.equals("s23"))
            {
                s23.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s23.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s23")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s24.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se24 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s24.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s24")
            }
            else if(seat != "0" && seat.equals("s24"))
            {
                s24.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s24.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s24")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s25.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se25 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s25.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s25")
            }
            else if(seat != "0" && seat.equals("s25"))
            {
                s25.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s25.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s25")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s26.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se26 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s26.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s26")
            }
            else if(seat != "0" && seat.equals("s26"))
            {
                s26.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s26.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s26")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s27.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se27 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s27.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s27")
            }
            else if(seat != "0" && seat.equals("s27"))
            {
                s27.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s27.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s27")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s28.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se28 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s28.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s28")
            }
            else if(seat != "0" && seat.equals("s28"))
            {
                s28.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s28.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s28")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s29.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se29 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s29.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s29")
            }
            else if(seat != "0" && seat.equals("s29"))
            {
                s29.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s29.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s29")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s30.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se30 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s30.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s30")
            }
            else if(seat != "0" && seat.equals("s30"))
            {
                s30.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s30.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s30")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s31.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se31 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s31.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s31")
            }
            else if(seat != "0" && seat.equals("s31"))
            {
                s31.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s31.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s31")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s32") {s32.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })
        s32.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(se32 == "red")
            {
                Toast.makeText(this,"Ticket Already Booked",Toast.LENGTH_SHORT).show()
            }
            else if(seat == "0")
            {
                s32.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s32")
            }
            else if(seat != "0" && seat.equals("s32"))
            {
                s32.setColorFilter(Color.argb(255,255,255,255))
                book_seatno.setText("0")
            }
            else if(seat != "0")
            {
                s32.setColorFilter(Color.argb(255, 0, 255, 0))
                book_seatno.setText("s32")

                if (seat == "s1") {s1.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s2") {s2.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s3") {s3.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s4") {s4.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s5") {s5.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s6") {s6.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s7") {s7.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s8") {s8.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s9") {s9.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s10") {s10.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s11") {s11.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s12") {s12.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s13") {s13.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s14") {s14.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s15") {s15.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s16") {s16.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s17") {s17.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s18") {s18.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s19") {s19.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s20") {s20.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s21") {s21.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s22") {s22.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s23") {s23.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s24") {s24.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s25") {s25.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s26") {s26.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s27") {s27.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s28") {s28.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s29") {s29.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s30") {s30.setColorFilter(Color.argb(255, 255, 255, 255))}
                if (seat == "s31") {s31.setColorFilter(Color.argb(255, 255, 255, 255))}
            }
        })

        book_back.setOnClickListener({
            val intent = Intent(this,User_Booking_Ticket::class.java)
            intent.putExtra("mobileno",mobilenumber)
            startActivity(intent)
        })

        userbookseat.setOnClickListener({
            var seat = book_seatno.text.toString()
            if(seat == "0")
            {
                Toast.makeText(this,"Please Select Seat", Toast.LENGTH_SHORT).show()
            }
            else
            {
                val intent = Intent(this,User_Booking_Details::class.java)
                intent.putExtra("mobileno",mobilenumber)
                intent.putExtra("seatno",seat)
                intent.putExtra("flightno",fl_fno)
                startActivity(intent)
            }
        })






    }
}