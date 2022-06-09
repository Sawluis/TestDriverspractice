package com.example.testdriverspractice.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testdriverspractice.databinding.ActivityMenuBinding
import com.example.testdriverspractice.model.DataObject
import com.example.testdriverspractice.view.adapter.CustomAdapter
import kotlinx.android.synthetic.main.activity_menu.*

class activityMenu: AppCompatActivity() {
    private lateinit var binding:ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //val toolbar: Toolbar = binding.toolmenuprincipal

        val data: MutableList<DataObject> = ArrayList()

        for (i in 1..10){
            data.add(DataObject("Titulo $i", "Subtitulo $i", "Imagen $i"))
        }

        binding.rvEasy.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = CustomAdapter(data)
        }

        binding.rvHard.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = CustomAdapter(data)
        }

        binding.rvHardest.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = CustomAdapter(data)
        }

        binding.rvExam.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = CustomAdapter(data)
        }
    }
}