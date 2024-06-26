package com.example.app_food

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.app_food.adapter.FoodAdapter
import com.example.app_food.databinding.ActivityMainBinding
import com.example.app_food.model.Food

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var foodAdapter: FoodAdapter
    private val foodList: MutableList<Food> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerViewFood = binding.RecyclerViewFood
        recyclerViewFood.layoutManager = LinearLayoutManager(this)
        recyclerViewFood.setHasFixedSize(true)
        foodAdapter = FoodAdapter(this, foodList)
        recyclerViewFood.adapter = foodAdapter
        getFood()
    }

    private fun getFood() {
        val food1 = Food(
            imgFood = R.drawable.food1,
            foodName = "Food 1",
            foodDescription = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut",
            price = "$ 120.00"
        )
        foodList.add(food1)
        val food2 = Food(
            imgFood = R.drawable.food2,
            foodName = "Food 2",
            foodDescription = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut",
            price = "$ 80.00"
            )
        foodList.add(food2)

        val food3 = Food(
            imgFood = R.drawable.food3,
            foodName = "Food 3",
            foodDescription = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut",
            price = "$ 72.00"
        )
        foodList.add(food3)

        val food4 = Food(
            imgFood = R.drawable.food4,
            foodName = "Food 4",
            foodDescription = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut",
            price = "$ 45.00"
        )
        foodList.add(food4)

        val food5 = Food(
            imgFood = R.drawable.food5,
            foodName = "Food 5",
            foodDescription = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut",
            price = "$ 50.00"
        )
        foodList.add(food5)
    }
}