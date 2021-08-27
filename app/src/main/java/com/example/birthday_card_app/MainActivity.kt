package com.example.birthday_card_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createBirthdayCard(view: android.view.View) {

        var name = nameEdit.editableText.toString()
        Toast.makeText(context:this, text:"name is $name", Toast.LENGTH_LONG).show()
    }
}