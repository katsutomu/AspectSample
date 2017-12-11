package com.example.katsu.aspectsample

import android.util.Log

class Tracker {
    companion object {
        fun sendEvent(eventParam:String) {
            // send event
            Log.d("Tracker", eventParam)
        }
    }
}