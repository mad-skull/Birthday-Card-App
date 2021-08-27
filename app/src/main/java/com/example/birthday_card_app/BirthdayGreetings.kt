package com.example.birthday_card_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BirthdayGreetings : AppCompatActivity() {

    companion object {
        const val = NAME_EXTRA = "name extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greetings)

        val name = intent.getStringArrayExtra(NAME_EXTRA)
        BirthdayGreetings.text = "Happy Birthday $name"
    }
}