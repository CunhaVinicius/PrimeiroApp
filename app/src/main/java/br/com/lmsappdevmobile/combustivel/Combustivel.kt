package br.com.lmsappdevmobile.combustivel

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.lmsappdevmobile.combustivel.databinding.ActivityCombustivelBinding

class Combustivel : AppCompatActivity() {
    private val context : Context get () = this
    private val binding by lazy {
        ActivityCombustivelBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnVereficar.setOnClickListener {
            onClickverificar()
        }
    }
    fun onClickverificar(){
        val Gasolina = binding.camGas.text.toString().toFloat();
        val Etanol = binding.camEtanol.text.toString().toFloat();

        val result = Etanol/Gasolina

        if (result < 0.70){
            Toast.makeText(this, "Melhor usar Etanol", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this, "Melhor usar Gasolina", Toast.LENGTH_SHORT).show()

        }
    }
}



