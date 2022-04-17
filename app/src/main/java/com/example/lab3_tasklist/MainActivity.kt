package com.example.lab3_tasklist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private val stringArray = Array<String?>(5){""}
    private lateinit var taskEditText: EditText
    private lateinit var addTaskBttn: Button
    private var size = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addTaskBttn = findViewById(R.id.add_Button)
        taskEditText = findViewById(R.id.task_editText)

        addTaskBttn.setOnClickListener {
            val taskString = taskEditText.text
            if (size < 5) {
                stringArray[size] = taskString.toString()
                println("This is the array: " + stringArray[size])
                size++
            }
            else {
                val dialog = WarningDialogFragment()
                dialog.show(supportFragmentManager, "warningDialog")
            }
        }
    }



}