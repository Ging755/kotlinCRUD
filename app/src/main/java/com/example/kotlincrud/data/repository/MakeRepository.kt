package com.example.kotlincrud.data.repository

import com.example.kotlincrud.data.dal.FakeDAL
import com.example.kotlincrud.data.model.Make
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MakeRepository @Inject constructor (private val dal: FakeDAL){
    fun getMakes() = dal.getMakes();

    fun addMake(make: Make) = dal.addMake(make);
}