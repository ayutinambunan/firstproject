package com.example.praktikummobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var input_panjang : EditText
    private lateinit var input_lebar : EditText
    private lateinit var input_tinggi : EditText
    private lateinit var btn : Button
    private lateinit var teks_hasil : TextView
    companion object {
        private const val STATE_RESULT =  "state_result"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        input_lebar= findViewById(R.id.edt_width)
        input_panjang= findViewById(R.id.edt_length)
        input_tinggi= findViewById(R.id.edt_height)
        btn= findViewById(R.id.btn_result)
        teks_hasil= findViewById(R.id.result)

        btn.setOnClickListener(this)

        if (savedInstanceState != null){
            teks_hasil.text = savedInstanceState.getString(STATE_RESULT)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_RESULT, teks_hasil.text.toString())
    }



}



