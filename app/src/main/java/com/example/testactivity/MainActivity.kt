package com.example.testactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("myTestActivity", "MainActivity onCreate() called")
    }

    fun onClickGoMain(view: View) {
        val intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
    }
    fun onClickGoWeb(view: View){
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=dQw4w9WgXcQ"))
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        Log.w("myTestActivity", "MainActivity onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.w("myTestActivity", "MainActivity onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.w("myTestActivity", "MainActivity onPause() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("myTestActivity", "MainActivity onDestroy() called")
    }
}
