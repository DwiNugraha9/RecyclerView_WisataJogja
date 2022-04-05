package com.example.recyclerview_wisatajogja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailWisata : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_wisata)
        supportActionBar?.title= "Detail Wisata"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val wisata = intent.getParcelableExtra<Wisata>(MainActivity.INTENT_PARCELABLE)

        val imgWisata = findViewById<ImageView>(R.id.img_item_photo)
        val nameWisata = findViewById<TextView>(R.id.tv_item_name)
        val descWisata = findViewById<TextView>(R.id.tv_item_description)

        imgWisata.setImageResource(wisata?.imgWisata!!)
        nameWisata.text = wisata.nameWisata
        descWisata.text = wisata.descWisata
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}