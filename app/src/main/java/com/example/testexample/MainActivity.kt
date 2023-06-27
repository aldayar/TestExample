package com.example.testexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatDelegate
import com.example.testexample.databinding.ActivityMainBinding
import java.lang.String

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val math = MyMathTest()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mathLogic()

    }

    private fun mathLogic() {
        binding.btnAdd.setOnClickListener {
            val num1 = Integer.valueOf(binding.etNum1.text.toString())
            val num2 = Integer.valueOf(binding.etNum2.text.toString())
            binding.tvResult.text = String.valueOf(math.add(num1, num2))
            binding.tvResult.visibility = View.VISIBLE
        }
        binding.btnSub.setOnClickListener{
            val num1 = Integer.valueOf(binding.etNum1.text.toString())
            val num2 = Integer.valueOf(binding.etNum2.text.toString())
            binding.tvResult.text = String.valueOf(math.sub(num1, num2))
            binding.tvResult.visibility = View.VISIBLE
        }
        binding.btnMult.setOnClickListener{
            val num1 = Integer.valueOf(binding.etNum1.text.toString())
            val num2 = Integer.valueOf(binding.etNum2.text.toString())
            binding.tvResult.text = String.valueOf(math.mult(num1, num2))
            binding.tvResult.visibility = View.VISIBLE
        }
        binding.btnDev.setOnClickListener{
            val num1 = Integer.valueOf(binding.etNum1.text.toString())
            val num2 = Integer.valueOf(binding.etNum2.text.toString())
            binding.tvResult.text = String.valueOf(math.dev(num1, num2))
            binding.tvResult.visibility = View.VISIBLE
        }
    }

}