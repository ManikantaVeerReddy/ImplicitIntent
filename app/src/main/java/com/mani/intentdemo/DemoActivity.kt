package com.mani.intentdemo

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class DemoActivity : Activity(), View.OnClickListener {

    lateinit var tvOrange : TextView
    lateinit var tvWhite : TextView
    lateinit var tvGreen : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        tvOrange =findViewById(R.id.tvOrange)
        tvGreen = findViewById(R.id.tvGreen)
        tvWhite = findViewById(R.id.tvWhite)

        tvWhite.setOnClickListener(this)
        tvOrange.setOnClickListener(this)
        tvGreen.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        when(v?.id){
            R.id.tvOrange ->{
                Toast.makeText(this,tvOrange.text.toString(),Toast.LENGTH_SHORT).show()
            }
            R.id.tvGreen ->{
                Toast.makeText(this,tvGreen.text.toString(),Toast.LENGTH_SHORT).show()
            }
            R.id.tvWhite ->{
                Toast.makeText(this,tvWhite.text.toString(),Toast.LENGTH_SHORT).show()
            }

        }
    }
}