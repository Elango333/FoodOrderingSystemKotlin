package com.MainPage

import com.Hotel.Hotel

interface CustomerMainPageFuncInterface {
    fun selectHotel() : Hotel?
    fun displayHotels()
    fun searchHotel()
}