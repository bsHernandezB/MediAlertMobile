package com.example.medialertapp

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button


class FillDataAlarm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fill_data_alarm)

        val button2 = findViewById<Button>(R.id.button2)
        val button4 = findViewById<Button>(R.id.button4)
        val button6 = findViewById<Button>(R.id.button6)

        button2.setOnClickListener(View.OnClickListener {
            DatePickerDialog(
                this@FillDataAlarm,
                R.style.CustomDatePickerDialog
            ).show()
        })

        button4.setOnClickListener(View.OnClickListener {
            DatePickerDialog(
                this@FillDataAlarm,
                R.style.CustomDatePickerDialog
            ).show()
        })

        button6.setOnClickListener(View.OnClickListener {
            AlertDialog.Builder(
                this@FillDataAlarm,
                R.style.CustomDatePickerDialog
            ).setItems(R.array.soundsItems, DialogInterface.OnClickListener { dialog, id ->
                dialog.dismiss()
            })
                .show()
        })
    }

    fun goToHistory(view: View){
        val intent = Intent(this, HistoryAlarm::class.java)
        startActivity(intent)
    }

    fun goToPrincipal(view: View){
        val intent = Intent(this, CreateAlarm::class.java)
        startActivity(intent)
    }

    fun goToEditAlarms(view: View){
        val intent = Intent(this, EditAlarms::class.java)
        startActivity(intent)
    }

    fun saveAlarm(view: View){
        val intent = Intent(this, CreateAlarm::class.java).apply {
            putExtra(EXTRA_MESSAGE, "1")
        }
        startActivity(intent)
    }
}