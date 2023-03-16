package com.example.medialertapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HistoryAlarm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history_alarm)
    }

    fun goToPrincipal(view: View){
        val intent = Intent(this, CreateAlarm::class.java)
        startActivity(intent)
    }

    fun goToEditAlarms(view: View){
        val intent = Intent(this, EditAlarms::class.java)
        startActivity(intent)
    }
}