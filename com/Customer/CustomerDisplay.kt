package com.Customer;

import com.Food.Food
import java.util.Scanner

class CustomerDisplay {

    fun showFeatures(): Int? {
        println("""
            ╔═══════════════════════════════════════╗
            ║                                       ║
            ║   Order food             - Press (1)  ║
            ║                                       ║
            ║   cancel food            - Press (2)  ║
            ║                                       ║
            ║   view order details     - Press (3)  ║
            ║                                       ║
            ║   Back                   - Press (4)  ║
            ║                                       ║
            ╚═══════════════════════════════════════╝
        """.trimIndent())
        val optionStr = readlnOrNull()
        val option = optionStr?.toIntOrNull()
        return option
    }

    fun cancelFood(): String? {
        println("Enter the food name to cancel")
        var foodName : String? = readlnOrNull()
        return foodName
    }

    fun displayOrderList(food: Food?) {
        println("----- ----- -----")
        println("Food name     : ${food?.foodName}")
        println("Food type     : ${food?.foodType}")
        println("Food price    : ${food?.price}")
        println("Food quantity : ${food?.quantity}")
        println("----- ----- -----\n")
    }

    fun askMoreFood(): Int? {
        val showFeaturesSnr = Scanner(System.`in`)
        println("""
            ╔═══════════════════════════════════════╗
            ║                                       ║
            ║   add more food          - Press (1)  ║
            ║                                       ║
            ║   Back                   - Press (2)  ║
            ║                                       ║
            ╚═══════════════════════════════════════╝
        """.trimIndent())
        val optionStr = readlnOrNull()
        val option = optionStr?.toIntOrNull()
        return option
    }
}
