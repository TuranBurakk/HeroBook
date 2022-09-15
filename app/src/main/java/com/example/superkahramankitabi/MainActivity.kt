package com.example.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        
        var superKahramanIsimleri = arrayListOf<String>()
        superKahramanIsimleri.add("Batman")
        superKahramanIsimleri.add("Superman")
        superKahramanIsimleri.add("Ironman")
        superKahramanIsimleri.add("Aquaman")
        superKahramanIsimleri.add("spidibeko")

        val batmanDrawableId= R.drawable.batman
        val supermanDrawableId= R.drawable.superman
        val IronmanDrawableId= R.drawable.ironman
        val AquamanDrawableId= R.drawable.aquaman
        val SpidibekoDrawableId= R.drawable.spiderman

        var superKahramanDrawableListesi = ArrayList<Int>()
        superKahramanDrawableListesi.add(batmanDrawableId)
        superKahramanDrawableListesi.add(supermanDrawableId)
        superKahramanDrawableListesi.add(IronmanDrawableId)
        superKahramanDrawableListesi.add(AquamanDrawableId)
        superKahramanDrawableListesi.add(SpidibekoDrawableId)

        //adapter
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        val adapter = RecycleAdapter(superKahramanIsimleri,superKahramanDrawableListesi)
        recyclerView.adapter = adapter
    }
}