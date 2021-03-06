package com.example.sample.viewmodels

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class EngagementViewModelFactory(
    private val application: Application
) : ViewModelProvider.AndroidViewModelFactory(application) {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        require(modelClass == EngagementViewModel::class.java) { "Unknown ViewModel class" }
        return EngagementViewModel(
            application
        ) as T
    }
}