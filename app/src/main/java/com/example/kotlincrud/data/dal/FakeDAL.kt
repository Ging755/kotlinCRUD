package com.example.kotlincrud.data.dal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.kotlincrud.data.model.Make
import javax.inject.Inject

class FakeDAL @Inject constructor() {
    private val makeList = mutableListOf<Make>();
    private val makes = MutableLiveData<List<Make>>();

    init {
        makes.value = makeList;
    }

    fun addMake(make: Make){
        makeList.add(make);
        makes.value = makeList;
    }

    fun getMakes() = makes as LiveData<List<Make>>
}