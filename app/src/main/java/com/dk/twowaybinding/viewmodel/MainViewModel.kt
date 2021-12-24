package com.dk.twowaybinding.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dk.twowaybinding.model.Student

class MainViewModel:ViewModel() {

    val studentLiveData = MutableLiveData("This is DK")


    fun updateData(){
        studentLiveData.value = "Sami"

    }
}