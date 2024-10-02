package com.example.bmiviewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class BMIViewModel: ViewModel() {
    var heightInput by mutableStateOf("")
    var weightInput by mutableStateOf("")

    fun changeHeightInput(value: String) {
        heightInput = value
    }

    fun changeWeightInput(value: String) {
        weightInput = value
    }

    private var height: Float = 0.00f
        get() {
            return heightInput.toFloatOrNull() ?: 0.00f
        }

    private var weight: Float = 0.00f
        get() {
            return weightInput.toFloatOrNull() ?: 0.00f
        }

    fun BMI(): Float {
        if (height > 0 && weight > 0) {
            return weight / (height*height)
        }
        return 0.00f
    }
}