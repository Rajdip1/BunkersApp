package com.example.bunkers

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bunkers.ui.theme.BunkersTheme

class MainActivity2 : ComponentActivity() {

    //creating a key
    companion object{
        const val Key ="com.example.bunkers.MainActivity3.Key"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val et1 = findViewById<EditText>(R.id.eT1)
        val et2 = findViewById<EditText>(R.id.eT2)
        val et3 = findViewById<EditText>(R.id.eT3)
        val et4 = findViewById<EditText>(R.id.eT4)
        val et5 = findViewById<EditText>(R.id.eT5)
        val btnOrderNow = findViewById<Button>(R.id.btnOrderNow)

        btnOrderNow.setOnClickListener {
            val placedOrders = et1.text.toString()+"\n"+et2.text.toString()+"\n"+et3.text.toString()+"\n"+
                    et4.text.toString()+"\n"+et5.text.toString()

            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra(Key,placedOrders)
            startActivity(intent)
        }
    }
}

