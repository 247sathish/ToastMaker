package com.sat.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sat.alertdialog.*
import splitties.views.textColorResource


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ToastMake.SToast(applicationContext,"Hiiiiiiiiiiiiiiiiiiii i am from library")

//        alertDialog {
//            messageResource = R.string.app_name
//            okButton {
//                Toast.makeText(applicationContext,"hiii",Toast.LENGTH_SHORT).show()
//            }
//            cancelButton()
//        }.onShow {
//            positiveButton.textColorResource = R.color.purple_200
//        }.show()
    }
}