package com.example.lab3_tasklist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private val stringArray = Array<String?>(10){""}
    private lateinit var taskEditText: EditText
    private lateinit var addTaskBttn: Button
    private lateinit var textviewList: TextView
    private var size = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addTaskBttn = findViewById(R.id.add_Button)
        taskEditText = findViewById(R.id.task_editText)
        textviewList = findViewById(R.id.task_TextView2)

        // Button Listener that adds a task to the list
        addTaskBttn.setOnClickListener {
            val taskString = taskEditText.text
            var tempString = ""
            if (size < 10) {
                stringArray[size] = taskString.toString()
                tempString = stringArray[size] + "\n"
                println("This is the array: " + stringArray[size])
                size++
            } else {
                val dialog = WarningDialogFragment()
                dialog.show(supportFragmentManager, "warningDialog")
            }
            textviewList.append(tempString)
        }
        textviewList.setMovementMethod(ScrollingMovementMethod())
}


    }