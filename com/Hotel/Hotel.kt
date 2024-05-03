package com.Hotel

import com.Food.Food

class Hotel {
        var hotelName: String? = null
        var address: String? = null
        val foodList: ArrayList<Food?> = ArrayList()
        val customerOrders: ArrayList<Food?> = ArrayList()
        val orderList: ArrayList<ArrayList<Food?>> = ArrayList()

}