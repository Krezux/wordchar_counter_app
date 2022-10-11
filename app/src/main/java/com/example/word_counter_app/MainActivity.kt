package com.example.word_counter_app

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.word_counter_app.modules.OptionSelect


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // vals

        val spinner : Spinner = findViewById(R.id.ui_spinner)
        val textMain : TextView = findViewById(R.id.ui_textLabel)
        val buttonClick : Button = findViewById(R.id.ui_mainButton)
        val textLabel : EditText = findViewById(R.id.ui_textBox)

        //
        ArrayAdapter.createFromResource( // spinner import
            this,
            R.array.selection_array,
            android.R.layout.simple_spinner_item
        )
            .also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                spinner.adapter = adapter
            }


        buttonClick.setOnClickListener()
        {
            val uncountedText: String =
                textLabel.text.toString() // getting text that'll be sent to function OptionSelect -> CountText -> OptionSelect

            val choice: String = spinner.selectedItem.toString() // Spinner choice received
            val select_module = OptionSelect()

            val result : String = select_module.HandleChoices(choice, uncountedText).toString()

            if(result != "0") { textMain.text = result } // Result dealer
            else {
                textMain.text = ""
                Toast.makeText(this@MainActivity, "Please insert text", Toast.LENGTH_SHORT).show()
            }

        }
    }
}