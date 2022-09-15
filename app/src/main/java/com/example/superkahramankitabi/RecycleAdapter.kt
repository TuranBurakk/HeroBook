package com.example.superkahramankitabi

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rec_row.view.*

class RecycleAdapter(val kahramanListesi: ArrayList<String>,val kahramanGorselleri : ArrayList<Int>) :
    RecyclerView.Adapter<RecycleAdapter.SuperKahramanVH>(){

    class SuperKahramanVH(itemView : View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.rec_row,
        parent,false)
        return SuperKahramanVH(itemView)
    }

    override fun onBindViewHolder(holder: SuperKahramanVH, position: Int) {
        holder.itemView.recyclerViewTextView.text = kahramanListesi.get(position)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,tanitim::class.java)
            intent.putExtra("superKahramanIsmi",kahramanListesi.get(position))
            intent.putExtra("superKahramanGorselleri",kahramanGorselleri.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }
    override fun getItemCount(): Int {
       return kahramanListesi.size
    }

}