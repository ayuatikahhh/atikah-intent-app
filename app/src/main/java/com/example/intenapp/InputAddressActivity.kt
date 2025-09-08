package com.example.intenapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.intenapp.databinding.ActivityInputAddressBinding

class InputAddressActivity : AppCompatActivity() {

    lateinit var binding: ActivityInputAddressBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityInputAddressBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btnSubmit.setOnClickListener {
                val resultIntent = Intent()
                // Kirim alamat
                resultIntent.putExtra(MainActivity.EXTRA_ADDRESS, edtAddress.text.toString())

                //Kirim Umur
                resultIntent.putExtra(MainActivity.EXTRA_AGE, edtAge2.text.toString())


                setResult(Activity.RESULT_OK, resultIntent)
                finish()
            }
        }
    }
}