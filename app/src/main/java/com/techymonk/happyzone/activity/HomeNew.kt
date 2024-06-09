package com.techymonk.happyzone.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import androidx.cardview.widget.CardView
import com.techymonk.happyzone.R

class HomeNew : AppCompatActivity() {


     lateinit var cvAnimals:CardView
     lateinit var cvColors:CardView
     lateinit var cvAlphabets:CardView
     lateinit var cvNum:CardView
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home_new)
        supportActionBar?.hide()


         cvAlphabets=findViewById(R.id.cvAlphabets)
         cvNum=findViewById(R.id.cvNum)
         cvColors=findViewById(R.id.cvColors)
         cvAnimals=findViewById(R.id.cvAnimals)

         cvAlphabets.setOnClickListener({
             val intent=Intent(this@HomeNew,Categories::class.java)
             startActivity(intent)
         })
         cvNum.setOnClickListener({
             val intent=Intent(this@HomeNew,Categories::class.java)
             startActivity(intent)
         })
         cvColors.setOnClickListener({
             val intent=Intent(this@HomeNew,Categories::class.java)
             startActivity(intent)
         })
         cvAnimals.setOnClickListener({
             val intent=Intent(this@HomeNew,Categories::class.java)
             startActivity(intent)
         })










    }
}