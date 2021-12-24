package com.dk.twowaybinding.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dk.twowaybinding.R
import com.dk.twowaybinding.databinding.ActivityMainBinding
import com.dk.twowaybinding.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel
    lateinit var databinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        databinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.studentLiveData.observe(this,{
            databinding.tvUpdatedName.text = it
        })

        databinding.mainviewmodel = mainViewModel
        databinding.lifecycleOwner = this
    }
}