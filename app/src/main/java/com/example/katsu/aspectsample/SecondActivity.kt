package com.example.katsu.aspectsample

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.example.katsu.aspectsample.R
import com.example.katsu.aspectsample.aspect.SendEvent

import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    @SendEvent(eventParam = "ShowSecondActivity")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

}
