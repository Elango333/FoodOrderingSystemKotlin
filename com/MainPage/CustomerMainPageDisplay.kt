package com.MainPage

import com.Hotel.Hotel

class CustomerMainPageDisplay {

    fun showMainPageDisplay(): Int? {
        println("""
        ╔═══════════════════════════════════╗
        ║                                   ║
        ║    Search hotel      - Press (1)  ║
        ║                                   ║
        ║    Select hotel      - Press (2)  ║
        ║                                   ║
        ╚═══════════════════════════════════╝
    """.trimIndent())
        val optionStr = readlnOrNull()
        val option = optionStr?.toIntOrNull()
        return option
    }

    fun displayHotels(hotelList: ArrayList<Hotel?>) {
        println("----- HotelList -----\n")
        for (hotel in hotelList) {
            println("----- ----- ------")
            println("Hotel name    : ${hotel?.hotelName}")
            println("Hotel address : ${hotel?.address}")
            println("----- ----- ------\n")
        }
    }

    fun displaySelectedHotel(hotel: Hotel) {
        println("----- ----- ------")
        println("Hotel name    : ${hotel.hotelName}")
        println("Hotel address : ${hotel.address}")
        println("----- ----- ------")
    }

}