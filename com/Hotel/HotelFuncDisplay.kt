package com.Hotel

import com.Food.Food

class HotelFuncDisplay {

    fun displayFoods(food: Food?) {
        println("----- ----- -----")
        println("Food name     : ${food?.foodName}")
        println("Food type     : ${food?.foodType}")
        println("Food price    : ${food?.price}")
        println("Food quantity : ${food?.quantity}")
        println("----- ----- -----\n")
    }

    fun askOptionForFood(): Int? {
        println("""
            ╔═══════════════════════════════════╗
            ║                                   ║
            ║    Search food      - Press (1)   ║
            ║                                   ║
            ║    Select food      - Press (2)   ║
            ║                                   ║
            ╚═══════════════════════════════════╝
        """.trimIndent())
        val optionStr = readlnOrNull()
        val option = optionStr?.toIntOrNull()
        return option
    }

    fun askOptionForSearch(): Int? {
        println("""
            ╔═══════════════════════════════════╗
            ║                                   ║
            ║    Veg              - Press (1)   ║
            ║                                   ║
            ║    Non-Veg          - Press (2)   ║
            ║                                   ║
            ╚═══════════════════════════════════╝
        """.trimIndent())
        val optionStr = readlnOrNull()
        val option = optionStr?.toIntOrNull()
        return option
    }
}
