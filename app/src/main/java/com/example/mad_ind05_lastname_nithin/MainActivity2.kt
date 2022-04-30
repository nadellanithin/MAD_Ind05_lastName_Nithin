package com.example.mad_ind05_lastname_nithin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mad_ind05_lastname_nithin.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    var binding: ActivityMain2Binding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding?.root)

        val rowNum = intent.getStringExtra("rowNum")
        val sName = intent.getStringExtra("sName")
        val sArea = intent.getStringExtra("sArea")
        val sMap = intent.getIntExtra("sMap", 0)
        val sFlag = intent.getIntExtra("sFlag", 0)
        binding!!.sName.text = sName
        binding!!.sArea.text = sArea
        binding!!.sMap.setImageResource(sMap)
        binding!!.sFlag.setImageResource(sFlag)
    }
}