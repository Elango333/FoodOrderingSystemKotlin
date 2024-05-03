package com.HotelAdmin

import com.Food.Food
import java.util.Scanner

class HotelAdminDisplay {

    fun askOptionForHotelAdmin(): Int? {
        println("""
            ╔═══════════════════════════════════╗
            ║                                   ║
            ║   Add food           - Press (1)  ║
            ║                                   ║
            ║   remove food        - Press (2)  ║
            ║                                   ║
            ║   Back               - Press (3)  ║
            ║                                   ║
            ╚═══════════════════════════════════╝
        """.trimIndent())
        val optionStr = readlnOrNull()
        val option = optionStr?.toIntOrNull()
        return option
    }

    fun addFoodToList(): Food {
        val food = Food()
        println("Enter the food name")
        val foodName : String? = readlnOrNull()
        println("Enter the food type")
        val foodType : String? = readlnOrNull()
        println("Enter the price")
        val priceStr : String? = readlnOrNull()
        val price : Int? = priceStr?.toIntOrNull()
        println("Enter the quantity")
        val quantityStr : String? = readlnOrNull()
        val quantity : Int? = quantityStr?.toIntOrNull()
        food.foodName = foodName
        food.foodType = foodType
        food.price = price
        food.quantity = quantity
        return food
    }

    fun removeFoodFromList(): String? {
        println("Enter the food name to remove")
        val foodName : String? = readlnOrNull()
        return foodName
    }
}
