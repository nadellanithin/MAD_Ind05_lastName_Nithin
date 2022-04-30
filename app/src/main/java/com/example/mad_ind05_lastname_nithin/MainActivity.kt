package com.example.mad_ind05_lastname_nithin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mad_ind05_lastname_nithin.databinding.ActivityMainBinding
import layout.MyAdapter
import layout.StateDataModel

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        val adapter = MyAdapter(StateDataModel.stateList)
        binding?.rvStateNames?.adapter = adapter
        binding?.rvStateNames?.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}