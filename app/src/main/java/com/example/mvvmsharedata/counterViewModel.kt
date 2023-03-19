package com.example.mvvmsharedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class counterViewModel : ViewModel() {

    private val counter = MutableLiveData<Int>()

    init {
        counter.value = 0
    }

    fun increment()
    {
        counter.value = counter.value!! + 1
    }

    fun decrement()
    {
        counter.value = counter.value!! - 1
    }


    fun getCounterMethod() : LiveData<Int> = counter

}