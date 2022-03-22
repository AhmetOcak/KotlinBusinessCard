package com.businesscard

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.businesscard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mail.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("mailto:${binding.mail.text}"))
            startActivity(intent)
        }

        binding.phoneNumer.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${binding.phoneNumer.text}"))
            startActivity(intent)
        }
    }
}