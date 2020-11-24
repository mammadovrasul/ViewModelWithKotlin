package com.dev.viewmodelwithkotlin

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.dev.viewmodelwithkotlin.databinding.ActivityMainBinding

/**
 * Created by Rasul Mamadov on 11/24/2020.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.countText.text = viewModel.getCurrenCount().toString()

        binding.incerementButtton.setOnClickListener {

            binding.countText.text = viewModel.getUpdateCount().toString()

        }
    }
}