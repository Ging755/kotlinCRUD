package com.example.kotlincrud.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlincrud.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var makeViewModel: MakeViewModel;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
    }
}