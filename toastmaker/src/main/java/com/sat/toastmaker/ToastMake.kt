package com.sat.toastmaker

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

object ToastMake  {

    fun SToast(context: Context,msg:String)
    {
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
    }
}