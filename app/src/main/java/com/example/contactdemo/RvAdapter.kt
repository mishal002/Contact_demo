package com.example.contactdemo

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RvAdapter(val activity: MainActivity, val list: ArrayList<DataModel>) :
    RecyclerView.Adapter<RvAdapter.Viewdata>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewdata {
        val view = LayoutInflater.from(activity).inflate(R.layout.item_file, parent, false)
        return Viewdata(view)
    }

    override fun onBindViewHolder(holder: Viewdata, position: Int) {
        holder.img.setImageResource(list[position].image)
        holder.Contact.setText(list[position].name)

        holder.img.setOnClickListener {
            val intent = Intent(activity, ViewActivity2::class.java)
            intent.putExtra("name", list[position].name)
            intent.putExtra("image", list[position].image)
            activity.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class Viewdata(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val img = itemView.findViewById<ImageView>(R.id.img)
        val Contact = itemView.findViewById<TextView>(R.id.Contact)
    }

}
