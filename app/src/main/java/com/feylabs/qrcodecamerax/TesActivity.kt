package com.feylabs.qrcodecamerax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.feylabs.qrcodecamerax.databinding.ActivityTesBinding

class TesActivity : AppCompatActivity() {
    private val binding by lazy { ActivityTesBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val qrtext = intent.getStringExtra("result")
        binding.text.text = qrtext
    }
}