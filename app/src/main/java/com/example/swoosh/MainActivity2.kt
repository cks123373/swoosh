package com.example.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    var checkedItem = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun womenClicked(view : View){
        menBtn.isChecked=false
        coedBtn.isChecked=false
        checkedItem ="women"
    }
    fun menClicked(view: View){
        womenBtn.isChecked=false
        coedBtn.isChecked=false
        checkedItem ="men"
    }
    fun coedClicked(view: View){
        menBtn.isChecked=false
        womenBtn.isChecked=false
        checkedItem ="coed"
    }
}