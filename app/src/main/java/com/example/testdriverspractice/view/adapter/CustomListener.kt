package com.example.testdriverspractice.view.adapter
import com.example.testdriverspractice.model.DataObject

interface CustomListener {
    fun onCustomClicked(DataObject: DataObject , position: Int)
}