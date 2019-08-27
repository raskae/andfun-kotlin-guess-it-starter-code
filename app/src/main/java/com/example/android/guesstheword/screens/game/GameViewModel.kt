package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {

    val className = this.javaClass.simpleName

    init {
        Log.i(className, "GameViewModel created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i(className, "GameViewModel destroyed!")
    }
}