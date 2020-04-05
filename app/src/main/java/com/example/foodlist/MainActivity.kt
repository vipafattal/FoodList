package com.example.foodlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_up, RecipeFragment(), "Recipes").commit()

        card_search.setOnClickListener(){

            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_up, Search(), "search").commit()

        }


    }
}

