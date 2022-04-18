package com.example.lab3_tasklist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

/**
 * Main Activity of the program
 *
 * This class will host all of the actions/behaviours of the program.
 *
 * @author Josue B Navarrete
 */
class MainActivity : AppCompatActivity() {
    // Variables needed
    private val stringArray = Array<String?>(10){""}
    private lateinit var taskEditText: EditText
    private lateinit var addTaskBttn: Button
    private lateinit var textviewList: TextView
    private var size = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Assigning the component variables to their ID
        addTaskBttn = findViewById(R.id.add_Button)
        taskEditText = findViewById(R.id.task_editText)
        textviewList = findViewById(R.id.task_TextView2)

        // Button Listener that adds a task to the list
        addTaskBttn.setOnClickListener {
            val taskString = taskEditText.text
            var tempString = ""
            // Adds the task to the array
            if (size < 10) {
                stringArray[size] = taskString.toString()
                tempString = stringArray[size] + "\n"
                //Test
                //println("This is the array: " + stringArray[size])
                size++
            } else {
                // Alert dialog with a button
                val dialog = WarningDialogFragment()
                dialog.show(supportFragmentManager, "warningDialog")
            }
            // Append each line on to the textView
            textviewList.append(tempString)
        }
    }
}