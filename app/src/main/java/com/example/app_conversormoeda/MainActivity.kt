package com.example.app_conversormoeda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.app_conversormoeda.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDolar.setOnClickListener {
            val euros = binding.editEuros.text.toString().trim()


            if(!euros.isEmpty()){
                val resultado = euros.toDouble() * 0.8
                Toast.makeText(applicationContext,"${resultado}$", Toast.LENGTH_SHORT).show()
            }
        }
    }
}