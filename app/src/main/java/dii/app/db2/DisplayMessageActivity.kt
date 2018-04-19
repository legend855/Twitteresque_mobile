package dii.app.db2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
    }

    // get intent
    val message = intent.getStringExtra(EXTRA_MESSAGE)

    val textView = findViewById<TextView>(R.id.textView).apply {
        text= message
    }



}
