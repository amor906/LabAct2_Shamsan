package com.example.uielementspart1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.labact2.R

class Final_ACT : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final__a_c_t)

        val act3_name = intent.getStringExtra("name")
        findViewById<TextView>(R.id.act_3_name_value).text = act3_name


        val act3_email = intent.getStringExtra("email")
        findViewById<TextView>(R.id.act_3_email_value).text = act3_email


        val act3_age = intent.getIntExtra("age", 69)
        findViewById<TextView>(R.id.act_3_age_value).text = act3_age.toString()



        val act3dob = intent.getStringExtra("calender")
        findViewById<TextView>(R.id.act_3_calender_value).text = act3dob


        val act3phone = intent.getStringExtra("phone")
        findViewById<TextView>(R.id.act_3_phone_value).text = act3phone
    }

}