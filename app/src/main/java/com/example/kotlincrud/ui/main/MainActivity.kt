package com.example.kotlincrud.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.kotlincrud.R
import com.example.kotlincrud.data.model.Make
import com.example.kotlincrud.util.MyApplication
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var makeViewModel: MakeViewModel;

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as MyApplication).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        initUI();
    }

    private fun initUI() {
        makeViewModel.getMakes().observe(this, Observer { makes ->
            val stringBuilder = StringBuilder();
            makes.forEach{
                    make -> stringBuilder.append("${make.name}\n\n");
            }

            textView_makes.text = stringBuilder.toString();
        })

        button_add_make.setOnClickListener{
            val make = Make(editText_make.text.toString());

            makeViewModel.addMake(make);
            editText_make.setText("");
        }
    }
}