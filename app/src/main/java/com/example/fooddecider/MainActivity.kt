package com.example.fooddecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var foodList = arrayListOf("Nasi Goreng", "Rendang", "Gorengan", "Bakso", "Soto")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getRandomFoodBtn.setOnClickListener {
            var random = Random()
            var indexFoodList = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[indexFoodList]
        }

        addFoodBtn.setOnClickListener {
            var newFood = addFoodTxt.text.toString()
            foodList.add(newFood)
            addFoodTxt.text.clear()
        }

    }
}