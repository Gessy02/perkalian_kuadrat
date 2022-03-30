package org.d3if2133.kalkulatorkuadrat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import org.d3if2133.kalkulatorkuadrat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener { hitungHasil() }

    }
    private fun hitungHasil() {
        val input = binding.inputEditText.text.toString()
        val kuadrat = binding.kuadratEditText.text.toString()
        if (TextUtils.isEmpty(input)) {
            Toast.makeText(this, R.string.input_invalid, Toast.LENGTH_LONG).show()
            return
        }
        if (TextUtils.isEmpty(input)) {
            Toast.makeText(this, R.string.kuadrat_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val hasil = Math.pow(input.toDouble() , kuadrat.toDouble())
        binding.hasilTextView.text = getString(R.string.hasil_x, hasil)

    }
}