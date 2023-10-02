package com.example.praktikummobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithDataActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PRODI = "extra_prodi"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        val tvDataActivity: TextView = findViewById(R.id.tv_data_received)

        val name = intent.getStringArrayExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)
        val prodi = intent.getStringExtra(EXTRA_PRODI)

        val text = "Name : $name, Umur : $age, Prodi : $prodi"
        tvDataActivity.text = text
    }
}