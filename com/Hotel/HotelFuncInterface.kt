package com.Hotel

import com.Food.Food

interface HotelFuncInterface {
    fun orderFood(foodName : String?) : Food?
    fun selectFood() : String?
    fun cancelFood(food : Food?)
    fun getHotelName() : String?
    fun searchFood()
    fun displayFood()
    fun askOption() : String?
}