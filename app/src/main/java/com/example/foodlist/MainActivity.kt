package com.example.foodlist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, RecipeFragment(), "Recipes").commit()

        card_search.setOnClickListener {
            /*
             * We need to replace the fragment_container content so doesn't show fragments overlapping over each other
             * for that reason we should call replace instead of add.
             *
             */
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, SearchFragment(), "search").commit()
        }

    }
}

