package br.com.lmsappdevmobile.combustivel

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.lmsappdevmobile.combustivel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val context : Context get () = this
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnInicio.setOnClickListener {
            onClickLogin()
        }
    }

    fun onClickLogin () {
        val intent = Intent (context,Combustivel::class.java)
        startActivity(intent)
        Toast.makeText(this,"Você tocou em inicio",Toast.LENGTH_LONG).show()

    }

}

