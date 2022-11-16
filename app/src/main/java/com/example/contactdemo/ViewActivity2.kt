package com.example.contactdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.contactdemo.databinding.ActivityView2Binding

class ViewActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityView2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityView2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageView.setImageResource(intent.getIntExtra("name", 0))
        binding.textView.setText(intent.getStringExtra("name"))
    }
}