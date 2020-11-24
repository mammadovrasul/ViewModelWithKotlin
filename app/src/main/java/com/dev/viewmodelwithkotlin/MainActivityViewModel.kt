package com.dev.viewmodelwithkotlin

import androidx.lifecycle.ViewModel

/**
 * Created by Rasul Mamadov on 11/24/2020.
 */
class MainActivityViewModel : ViewModel() {
    private var count = 0

    fun getCurrenCount(): Int {
        return count
    }

    fun getUpdateCount(): Int {
        return count++
    }
}