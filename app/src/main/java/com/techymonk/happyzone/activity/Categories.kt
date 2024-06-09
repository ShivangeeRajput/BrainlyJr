package com.techymonk.happyzone.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.techymonk.happyzone.R

class Categories : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)
        supportActionBar?.hide()

    }
}