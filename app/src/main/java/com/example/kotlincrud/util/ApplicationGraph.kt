package com.example.kotlincrud.util

import android.app.Application
import com.example.kotlincrud.ui.main.MainActivity
import com.example.kotlincrud.ui.make.MakeActivity
import com.example.kotlincrud.ui.make.MakeFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface ApplicationComponent  {
    fun inject(activity: MakeActivity);
    fun inject(fragment: MakeFragment);
    fun inject(activity: MainActivity)
}

class MyApplication: Application() {
    val appComponent = DaggerApplicationComponent.create()
}