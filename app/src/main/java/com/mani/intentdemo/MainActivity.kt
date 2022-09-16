package com.mani.intentdemo

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : Activity(), View.OnClickListener {

     lateinit var tvNext : TextView
     lateinit var etFirstName : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvNext = findViewById(R.id.tvNext)
        etFirstName = findViewById(R.id.etFirstName)
        tvNext.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.tvNext ->{

                var firstName = etFirstName.text.toString()
                var intent = Intent(this,NextActivity :: class.java)
                intent.putExtra("F_NAME",firstName)
                startActivity(intent)
            }
        }
    }
}