package com.sat.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sat.toastmaker.ToastMake

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToastMake.SToast(applicationContext,"Hiiiiiiiiiiiiiiiiiiii i am from library")
    }
}