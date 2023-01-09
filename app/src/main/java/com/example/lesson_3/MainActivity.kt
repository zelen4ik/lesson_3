package com.example.lesson_3

import android.os.Bundle
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {
    private var binding:ActivityMainBinding?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.chek1?.setOnCheckedChangeListener(this)

        if(binding?.chek1?.isChecked == true) binding?.tvTextMain?.text = getString(R.string.tv_text2)

    }

    override fun onCheckedChanged(CompoundButton: CompoundButton, isChecked: Boolean) {
       if(isChecked) binding?.tvTextMain?.text = binding?.chek1?.text
        else binding?.tvTextMain?.text = getString(R.string.tv_text3)
    }
}