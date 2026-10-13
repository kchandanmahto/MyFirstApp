
package com.example.myfirstapp

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHome = findViewById<TextView>(R.id.navHome)
        val navProjects = findViewById<TextView>(R.id.navProjects)
        val navProfile = findViewById<TextView>(R.id.navProfile)

        navHome.setOnClickListener {
            showMessage("You are on Home")
        }

        navProjects.setOnClickListener {
            showMessage("Projects section selected")
        }

        navProfile.setOnClickListener {
            showMessage("Profile section selected")
        }
    }

    private fun showMessage(message: String) {
        Toast.makeText(
            this,
            message,
            Toast.LENGTH_SHORT
        ).show()
    }
}
