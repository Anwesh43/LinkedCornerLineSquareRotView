package com.anwesh.uiprojects.linkedcornerlinesquarerotview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.cornerlinesquarerotview.CornerLineSquareRotView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CornerLineSquareRotView.create(this)
    }
}
