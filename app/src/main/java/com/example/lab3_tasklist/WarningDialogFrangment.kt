package com.example.lab3_tasklist

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class WarningDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?)
            : Dialog {
        val builder = AlertDialog.Builder(requireActivity())
        builder.setTitle("Warning")
        builder.setMessage("You are out of storage")
        builder.setPositiveButton("OK", null)
        return builder.create()
    }
}
