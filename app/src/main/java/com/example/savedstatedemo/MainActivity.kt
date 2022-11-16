package com.example.savedstatedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString("Hello","I m Sir")
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {

        val info = savedInstanceState.getString("Hello")
        if (info != null) {
            Log.e("MyName",info)
        }else{
            Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
        }
        super.onRestoreInstanceState(savedInstanceState)
    }

}