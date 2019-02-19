package com.pedroroig.example.dialogyesorno

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.pedroroig.example.dialogyesorno.custom.CustomDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            launchDialog()
        }
    }

    private fun launchDialog() {
        CustomDialog().show(supportFragmentManager, "CUSTOM DIALOG")
    }
}
