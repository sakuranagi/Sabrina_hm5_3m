package com.example.sabrina_hm5_3m

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sabrina_hm5_3m.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().add(R.id.container, FirstFragment()).commit()

    }
}