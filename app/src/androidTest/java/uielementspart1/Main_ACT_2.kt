package com.example.uielementspart1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CalendarView
import com.example.labact2.R

class
Main_ACT_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main__a_c_t_2)
        findViewById<Button>(R.id.act_2_btn).setOnClickListener { foo() }
    }
    fun foo() {

        val intent1 = Intent(this, Final_ACT::class.java)
        val act2calender:String = findViewById<CalendarView>(R.id.act_2_calender).date.toString()



        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val age = intent.getIntExtra("seekbar",69)
        val phone =intent.getStringExtra("phone")

        intent1.putExtra("name", name)
        intent1.putExtra("email", email)
        intent1.putExtra("age", age)
        intent1.putExtra("calender", act2calender)
        intent1.putExtra("phone",phone)


        startActivity(intent1)
    }
}