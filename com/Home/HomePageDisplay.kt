package com.Home

import com.Customer.Customer
import com.Hotel.Hotel

class HomePageDisplay {

    fun showHomePageMenu() : Int?{
        println("""
    ╔═══════════════════════════════════╗
    ║                                   ║
    ║   Customer login     - Press (1)  ║
    ║                                   ║
    ║   HotelAdmin login   - Press (2)  ║
    ║                                   ║
    ║   DeliveryBoy login  - Press (3)  ║
    ║                                   ║
    ║   Exit               - Press (4)  ║
    ║                                   ║
    ╚═══════════════════════════════════╝
""".trimIndent())
        val optionStr = readlnOrNull()
        val option = optionStr?.toIntOrNull()
        return option
    }

    fun createHotel() : Hotel {
        val hotel = Hotel()
        println("Enter the hotel name")
        val name : String? = readlnOrNull()
        println("Enter the address")
        val address : String? = readlnOrNull()
        hotel.hotelName = name
        hotel.address = address
        return hotel
    }

    fun askOptionForLogin() : Int?{
        println("""
    ╔═══════════════════════════════════╗
    ║                                   ║
    ║   Login             - Press (1)   ║
    ║                                   ║
    ║   Signup            - Press (2)   ║
    ║                                   ║
    ╚═══════════════════════════════════╝
""".trimIndent())
        val optionStr = readlnOrNull()
        val option = optionStr?.toIntOrNull()
        return option
    }

    fun customerLogin() : String? {
        println("Enter the name to login")
        val name : String? = readlnOrNull()
        return name
    }

    fun customerSignin() : Customer {
        val customer = Customer()
        println("Enter the name")
        val name : String? = readlnOrNull()
        println("Enter the mobile number")
        val mobileNumber : String? = readlnOrNull()
        println("Enter the address")
        val address : String? = readlnOrNull()
        customer.name = name
        customer.address = address
        customer.mobileNumber = mobileNumber
        return customer
    }
}