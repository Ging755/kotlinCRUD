package com.example.kotlincrud.ui.make

import androidx.lifecycle.ViewModel
import com.example.kotlincrud.data.model.Make
import com.example.kotlincrud.data.repository.MakeRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MakeViewModel @Inject constructor(private val repo : MakeRepository) : ViewModel() {
    fun getMakes() = repo.getMakes();

    fun addMake(make : Make) =  repo.addMake(make);
}