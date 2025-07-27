package com.arkever.labtask2

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.transition.Visibility
import com.arkever.labtask2.R.*
import com.arkever.labtask2.R.id.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var name : EditText= findViewById<EditText>(R.id.lab)
        var sid = findViewById<EditText>(R.id.sid)
        var cg = findViewById<EditText>(R.id.cg)
        var credit = findViewById<EditText>(R.id.editTextText4)
        var cse = findViewById<RadioButton>(R.id.radioCSE)
        var eee = findViewById<RadioButton>(R.id.radioEEE)
        var bba = findViewById<RadioButton>(R.id.radioBBA)
        var law = findViewById<RadioButton>(R.id.radioLAW)
        var java = findViewById<CheckBox>(R.id.checkBoxjava)
        var cpp = findViewById<CheckBox>(R.id.checkBox2c)
        var cs = findViewById<CheckBox>(R.id.checkBox3cs)
        var kotlin = findViewById<CheckBox>(R.id.checkBox4kotlin)
        var submit = findViewById<Button>(R.id.button)
        var showname = findViewById<TextView>(R.id.showname)
        var shownaid = findViewById<TextView>(R.id.showid)
        var showcg = findViewById<TextView>(R.id.showcgpa)
        var showcredit = findViewById<TextView>(R.id.showcredit)
        var showndept = findViewById<TextView>(R.id.showdept)
        var lang  = findViewById<TextView>(R.id.showfav)



        submit.setOnClickListener {
            val n = name.text.toString()
            val id = sid.text.toString()
            val cgpa = cg.text.toString()
            val cred = credit.text.toString()
            var dept = ""
            if (cse.isChecked) dept = "CSE"
            if (eee.isChecked) dept = "EEE"
            if (bba.isChecked) dept = "BBA"
            if (law.isChecked) dept = "LAW"
            var langs = ""
            if (java.isChecked) langs += "Java, "
            if (cpp.isChecked) langs += "C++, "
            if (cs.isChecked) langs += "C#, "
            if (kotlin.isChecked) langs += "Kotlin, "


            if (langs.endsWith(", ")) {
                langs = langs.substring(0, langs.length - 2)
            }

            lang.text = "Favorite Languages: $langs"


            showname.text = "Name: $n"
            shownaid.text = "ID: $id"
            showcg.text = "CGPA: $cgpa"
            showcredit.text = "Completed Credit: $cred"
            showndept.text = "Department: $dept"
            showname.visibility = View.VISIBLE
            shownaid.visibility = View.VISIBLE
            showcg.visibility = View.VISIBLE
            showcredit.visibility = View.VISIBLE
            showndept.visibility = View.VISIBLE
            lang.visibility = View.VISIBLE
        }







    }
}