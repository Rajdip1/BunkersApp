package com.example.bunkers

import android.os.Bundle
import android.widget.TextView
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

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val tvOrder = findViewById<TextView>(R.id.tvOrder)

        val orderOfCustomer = intent.getStringExtra(MainActivity2.Key)

        tvOrder.text = "Your ordrs \n\n"+orderOfCustomer.toString()
    }
}

