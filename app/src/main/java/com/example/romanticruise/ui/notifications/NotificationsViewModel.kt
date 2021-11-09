package com.example.romanticruise.ui.notifications

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Ceci est le texte du fragment Profile"
    }
    val text: LiveData<String> = _text
}