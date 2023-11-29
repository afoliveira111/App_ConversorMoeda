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
            escrever(0.8)
        }
        binding.buttonPeso.setOnClickListener {
            escrever(10.2)
        }
        binding.buttonReal.setOnClickListener {
            escrever(5.0)
        }
    }

    private fun escrever(taxa: Double) {
        val euros = binding.editEuros.text.toString().trim()


        if(!euros.isEmpty()){
            val resultado = euros.toDouble() * taxa
            Toast.makeText(applicationContext,"${resultado}$", Toast.LENGTH_SHORT).show()
        }
    }
}