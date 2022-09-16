package com.mani.intentdemo

import android.app.Activity
import android.app.SearchManager
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract
import android.provider.MediaStore
import android.view.View
import android.widget.TextView

class SampleActivity  : Activity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)
        initialiazationViews()
    }

    private fun initialiazationViews() {

        findViewById<TextView>(R.id.tvContact).setOnClickListener(this)
        findViewById<TextView>(R.id.tvBrowse).setOnClickListener(this)
        findViewById<TextView>(R.id.tvSearch).setOnClickListener(this)
        findViewById<TextView>(R.id.tvCamera).setOnClickListener(this)
        findViewById<TextView>(R.id.tvMap).setOnClickListener(this)
        findViewById<TextView>(R.id.tvDialerPad).setOnClickListener(this)
        findViewById<TextView>(R.id.tvWhatsApp).setOnClickListener(this)


    }

    override fun onClick(v: View?) {

        when(v?.id){

            R.id.tvContact ->{
                    openContactPage()
            }

            R.id.tvBrowse ->{
                    openBrowser()
            }

            R.id.tvSearch ->{
                    openGoogleSearchEngine()
            }

            R.id.tvCamera ->{
                openCameraApp()
            }

            R.id.tvMap ->{
                openGoogleMap()
            }

            R.id.tvDialerPad ->{
                var intent = Intent(Intent.ACTION_DIAL,Uri.parse("tel:+91 7022503201"))
                startActivity(intent)
            }

            R.id.tvWhatsApp ->{

                var mobileNumber = "+917022503201"
                var message = "Hi i am from Implicit"
                var whatsAppIntent = Intent(Intent.ACTION_VIEW,Uri.parse("https://api.whatsapp.com/send?phone=$mobileNumber &text=$message"))
                startActivity(whatsAppIntent)
            }
        }

    }

    private fun openGoogleMap() {
        var mapIntent = Intent(Intent.ACTION_VIEW,Uri.parse("geo:0,0?q=People10 Technosoft Private Limited"))
        startActivity(mapIntent)
    }

    private fun openCameraApp() {
        var intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivityForResult(intent,1001)
    }

    private fun openGoogleSearchEngine() {
        var searchIntent = Intent(Intent.ACTION_WEB_SEARCH)
        searchIntent.putExtra(SearchManager.QUERY,"Android Latest Version")
        startActivity(searchIntent)
    }

    private fun openBrowser() {
        var browseIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://people10.com/"))
        startActivity(browseIntent)
    }

    private fun openContactPage() {
        var contactIntent = Intent(Intent.ACTION_VIEW,ContactsContract.Contacts.CONTENT_URI)
        startActivity(contactIntent)
    }
}
