package com.example.kotlincrud.util

import android.app.Application
import com.example.kotlincrud.data.repository.MakeRepository
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface ApplicationComponent  {

    fun makeRepository() : MakeRepository;
}

class MyApplication: Application() {
    val appComponent = DaggerApplicationComponent.create()
}