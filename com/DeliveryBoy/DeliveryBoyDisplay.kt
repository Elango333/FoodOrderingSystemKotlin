package com.DeliveryBoy

import com.Order.Orders
import java.util.Scanner

class DeliveryBoyDisplay {

    fun deliverFoods(order: Orders) {
        println("----- ----- -----")
        println("Customer name    : ${order.customerName}")
        println("Customer address : ${order.customerAddress}")
        println("Hotel name       : ${order.hotelName}")
        println("Foods delivered successfully!!!")
        println("----- ----- -----\n\n")
    }


    fun showFeatures(): Int? {
        val showFeaturesSnr = Scanner(System.`in`)
        println("""
            ╔═══════════════════════════════════════╗
            ║                                       ║
            ║   To Deliver foods       - Press (1)  ║
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
