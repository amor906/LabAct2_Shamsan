package com.example.uielementspart1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.labact2.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.act_1_btn).setOnClickListener { foo() }


        val seek = findViewById<SeekBar>(R.id.act_1_seekbar)
        seek?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
                val ageDisplay: TextView = findViewById(R.id.act_1_display_age)
                ageDisplay.text = "Age: ${seek.progress}"
            }

            override fun onStartTrackingTouch(seek: SeekBar) {


            }
            override fun onStopTrackingTouch(seek: SeekBar) {

                Toast.makeText(this@MainActivity, "Age: " + seek.progress + "", Toast.LENGTH_SHORT).show()

            }
        })


        val switch = findViewById<Switch>(R.id.act_1_switch)
        val phone = findViewById<EditText>(R.id.act_1_phone)
        phone.visibility = View.INVISIBLE
        switch.setOnCheckedChangeListener{switch, isChecked ->
            if (isChecked){
                phone.visibility = View.VISIBLE
            }else{
                phone.visibility = View.INVISIBLE
            }
        }
    }

    private fun foo(){

        val intent = Intent(this, Main_ACT_2::class.java)
        val name:String = findViewById<EditText>(R.id.act_1_name).text.toString()
        val email:String = findViewById<EditText>(R.id.act_1_email).text.toString()
        val seekValue:Int = findViewById<SeekBar>(R.id.act_1_seekbar).progress
        val phone:String = findViewById<EditText>(R.id.act_1_phone).text.toString()

        intent.putExtra("name", name)
        intent.putExtra("email", email)
        intent.putExtra("seekbar", seekValue)
        intent.putExtra("phone", phone)

        startActivity(intent)

    }

}