package com.example.kotlincrud.ui.make

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.kotlincrud.R
import com.example.kotlincrud.data.model.Make
import com.example.kotlincrud.ui.make.MakeViewModel
import kotlinx.android.synthetic.main.activity_make.*
import javax.inject.Inject

class MakeActivity : AppCompatActivity() {
    @Inject lateinit var makeViewModel: MakeViewModel;

    override fun onCreate(savedInstanceState: Bundle?) {
        //(applicationContext as MyApplication).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_make);
       // initUI();
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