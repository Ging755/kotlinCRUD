package com.example.kotlincrud.util

import android.app.Application
import com.example.kotlincrud.ui.main.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface ApplicationComponent  {
    fun inject(activity: MainActivity)
}

class MyApplication: Application() {
    val appComponent = DaggerApplicationComponent.create()
}