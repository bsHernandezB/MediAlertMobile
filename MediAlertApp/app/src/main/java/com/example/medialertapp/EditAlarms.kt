package com.example.medialertapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Layout
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Spinner
import android.widget.Toast

class EditAlarms : AppCompatActivity() {

    var posvalue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_alarms)
        val sitems = resources.getStringArray(R.array.spinnerItems)

        val spinner = findViewById<Spinner>(R.id.spinner)
        if (spinner != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, sitems)
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {

                    val btnejecutar = findViewById<Button>(R.id.button5)
                    val edittexthoras = findViewById<EditText>(R.id.editTextTextPersonName3)

                    posvalue = position

                    if (position == 1 || position == 2 || position == 3){
                        btnejecutar.visibility = View.VISIBLE
                    }
                    else{
                        btnejecutar.visibility = View.INVISIBLE
                    }

                    if (position == 1 || position == 2){
                        edittexthoras.visibility = View.VISIBLE
                    }
                    else{
                        edittexthoras.visibility = View.INVISIBLE
                    }

                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }
    }

    fun goToHistory(view: View){
        val intent = Intent(this, HistoryAlarm::class.java)
        startActivity(intent)
    }

    fun goToPrincipal(view: View){
        val intent = Intent(this, CreateAlarm::class.java)
        startActivity(intent)
    }

    fun uncheck(view: View){
        val checkBox3 = findViewById<CheckBox>(R.id.checkBox3)

        if (checkBox3.isChecked) {
            checkBox3.isChecked = false

            if (posvalue == 3){
                val alarm1 = findViewById<LinearLayout>(R.id.linearLayout9)
                alarm1.visibility = View.GONE
            }
        }

        val checkBox4 = findViewById<CheckBox>(R.id.checkBox4)

        if (checkBox4.isChecked) {
            checkBox4.isChecked = false

            if (posvalue == 3){
                val alarm1 = findViewById<LinearLayout>(R.id.linearLayout10)
                alarm1.visibility = View.GONE
            }
        }

        val checkBox5 = findViewById<CheckBox>(R.id.checkBox5)

        if (checkBox5.isChecked) {
            checkBox5.isChecked = false

            if (posvalue == 3){
                val alarm1 = findViewById<LinearLayout>(R.id.linearLayout11)
                alarm1.visibility = View.GONE
            }
        }

        val checkBox6 = findViewById<CheckBox>(R.id.checkBox6)

        if (checkBox6.isChecked) {
            checkBox6.isChecked = false

            if (posvalue == 3){
                val alarm1 = findViewById<LinearLayout>(R.id.linearLayout12)
                alarm1.visibility = View.GONE
            }
        }

        val checkBox7 = findViewById<CheckBox>(R.id.checkBox7)

        if (checkBox7.isChecked) {
            checkBox7.isChecked = false

            if (posvalue == 3){
                val alarm1 = findViewById<LinearLayout>(R.id.linearLayout13)
                alarm1.visibility = View.GONE
            }
        }
    }
}