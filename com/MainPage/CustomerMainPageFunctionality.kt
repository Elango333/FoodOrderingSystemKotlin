package com.MainPage

import com.Hotel.Hotel

class CustomerMainPageFunctionality(var hotelList : ArrayList<Hotel?>) : CustomerMainPageFuncInterface{
    private var customerDisplay = CustomerMainPageDisplay()
    override fun selectHotel(): Hotel? {
        var selectedHotel : Hotel? = null
        println("Enter the hotel name")
        val hotelName : String? = readlnOrNull()
        for(hotel in hotelList){
            if(hotel?.hotelName == hotelName){
                customerDisplay.displaySelectedHotel(hotel!!)
                selectedHotel = hotel
                break
            }
        }
        return selectedHotel
    }

    override fun displayHotels() {
        customerDisplay.displayHotels(hotelList)
    }

    override fun searchHotel() {
        println("Enter the hotel name");
        val hotelName : String? = readlnOrNull()
        for(hotel in hotelList){
            if(hotel?.hotelName == hotelName){
                customerDisplay.displaySelectedHotel(hotel!!)
            }
        }
        println("No hotels found!!!")
    }

    fun askOption() : Hotel?{
        displayHotels()
        val option : Int? = customerDisplay.showMainPageDisplay()
        when(option){
            1 -> {
                searchHotel()
                askOption()
            }
            2 -> {
                val hotel : Hotel? = selectHotel()
                return hotel
            }
        }
        return null;
    }
}