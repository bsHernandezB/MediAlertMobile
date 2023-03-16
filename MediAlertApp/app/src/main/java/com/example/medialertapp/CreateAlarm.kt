package com.example.medialertapp

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class CreateAlarm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_alarm)

        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val layoutcreated = findViewById<LinearLayout>(R.id.linearLayout15)

        if (message != null){
            if(message == "1"){

                layoutcreated.visibility = View.VISIBLE
            }
            else{
                layoutcreated.visibility = View.GONE
            }
        }
        else{
            layoutcreated.visibility = View.GONE
        }

        val imgbutton = findViewById<ImageButton>(R.id.imageButton)
        val textView20 = findViewById<TextView>(R.id.textView20)

        imgbutton.setOnClickListener(View.OnClickListener {
            AlertDialog.Builder(
                this@CreateAlarm,
                R.style.CustomDatePickerDialog
            ).setItems(R.array.oneItemsMessage, DialogInterface.OnClickListener { dialog, id ->
                AlertDialog.Builder(
                    this@CreateAlarm,
                    R.style.CustomDatePickerDialog
                ).setMessage("¿Tomaste el medicamento?")
                    .setNegativeButton("No", DialogInterface.OnClickListener { dialog, id ->
                        dialog.dismiss()
                    })
                    .setPositiveButton("Si", DialogInterface.OnClickListener { dialog, id ->
                        dialog.dismiss()
                    })
                    .show()
            })
                .show()
        })

        textView20.setOnClickListener(View.OnClickListener {
            AlertDialog.Builder(
                this@CreateAlarm,
                R.style.CustomDatePickerDialog
            ).setItems(R.array.oneItemsMessage, DialogInterface.OnClickListener { dialog, id ->
                AlertDialog.Builder(
                    this@CreateAlarm,
                    R.style.CustomDatePickerDialog
                ).setMessage("¿Tomaste el medicamento?")
                    .setNegativeButton("No", DialogInterface.OnClickListener { dialog, id ->
                        dialog.dismiss()
                    })
                    .setPositiveButton("Si", DialogInterface.OnClickListener { dialog, id ->
                        dialog.dismiss()
                    })
                    .show()
            })
                .show()
        })

        val imageButton3 = findViewById<ImageButton>(R.id.imageButton3)
        val textView24 = findViewById<TextView>(R.id.textView24)

        imageButton3.setOnClickListener(View.OnClickListener {
            AlertDialog.Builder(
                this@CreateAlarm,
                R.style.CustomDatePickerDialog
            ).setMessage("¿Desea eliminar la alarma?")
                .setNegativeButton("ACEPTAR", DialogInterface.OnClickListener { dialog, id ->
                    dialog.dismiss()
                    layoutcreated.visibility = View.GONE
                })
                .setPositiveButton("CANCELAR", DialogInterface.OnClickListener { dialog, id ->
                    dialog.dismiss()
                })
                .show()
        })

        textView24.setOnClickListener(View.OnClickListener {
            AlertDialog.Builder(
                this@CreateAlarm,
                R.style.CustomDatePickerDialog
            ).setMessage("¿Desea eliminar la alarma?")
                .setNegativeButton("ACEPTAR", DialogInterface.OnClickListener { dialog, id ->
                    dialog.dismiss()
                    layoutcreated.visibility = View.GONE
                })
                .setPositiveButton("CANCELAR", DialogInterface.OnClickListener { dialog, id ->
                    dialog.dismiss()
                })
                .show()
        })
    }

    fun goToHistory(view: View){
        val intent = Intent(this, HistoryAlarm::class.java)
        startActivity(intent)
    }

    fun goToRegister(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun goToEditAlarms(view: View){
        val intent = Intent(this, EditAlarms::class.java)
        startActivity(intent)
    }

    fun goToFillDataAlarm(view: View){
        val intent = Intent(this, FillDataAlarm::class.java)
        startActivity(intent)
    }
}