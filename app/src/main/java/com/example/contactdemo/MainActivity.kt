package com.example.contactdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    val list = arrayListOf<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addtolist("raj", R.drawable.ic_launcher_background)
        addtolist("tej", R.drawable.ic_launcher_background)
        addtolist("manoj", R.drawable.ic_launcher_background)
        addtolist("demo", R.drawable.ic_launcher_background)
        addtolist("raj", R.drawable.ic_launcher_background)
        addtolist("tej", R.drawable.ic_launcher_background)
        addtolist("hardik", R.drawable.ic_launcher_background)

        steUpRV(list)
    }

    fun addtolist(name: String, img: Int) {

        list.add(DataModel(name,img))
    }

    fun steUpRV(list: ArrayList<DataModel>) {

        val adapter = RvAdapter(this, list)
        val layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = layoutManager
    }


}
