package com.pedroroig.example.dialogyesorno.custom

import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.pedroroig.example.dialogyesorno.R


class CustomDialog : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView =  inflater.inflate(R.layout.custom_dialog, container, true)

        val buttonOk = rootView.findViewById<Button>(R.id.buttonDialogOk)
        buttonOk.setOnClickListener {
            Toast.makeText(context, "Ok Clicked", Toast.LENGTH_SHORT).show()
            dismiss()
        }

        val buttonCancel = rootView.findViewById<Button>(R.id.buttonDialogCancel)
        buttonCancel.setOnClickListener {
            Toast.makeText(context, "Cancel Clicked", Toast.LENGTH_SHORT).show()
            dismiss()
        }

        return rootView
    }

}