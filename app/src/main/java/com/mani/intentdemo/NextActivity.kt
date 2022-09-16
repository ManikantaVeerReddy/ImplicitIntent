package com.mani.intentdemo

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class NextActivity : Activity(), View.OnClickListener {

    lateinit var tvBack : TextView
    lateinit var etFirstName : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        etFirstName = findViewById(R.id.etFirstName)
        tvBack = findViewById(R.id.tvBack)
        tvBack.setOnClickListener(this)
        etFirstName.setText("${intent.extras?.getString("F_NAME")}")
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.tvBack ->{
                startActivity(Intent(this,SampleActivity :: class.java))
            }
        }
    }
}