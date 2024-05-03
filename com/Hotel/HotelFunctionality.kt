package com.Hotel

import com.Food.Food

class HotelFunctionality(var selectedHotel : Hotel?) : HotelFuncInterface {
    private var hotelDisplay = HotelFuncDisplay()

    override fun orderFood(foodName: String?): Food? {
        for(food in selectedHotel?.foodList!!){
            println("FoodName : ${food?.foodName}")
                if(food?.foodName == foodName){
                    selectedHotel?.customerOrders?.add(food)
                    selectedHotel?.orderList?.add(selectedHotel?.customerOrders!!)
                    return food
                }
        }
        return null
    }

    override fun selectFood(): String? {
        println("Enter the food name")
        val foodName : String? = readlnOrNull()
        for(food in selectedHotel?.foodList!!){
            if(food?.foodName == foodName){
                return foodName
            }
        }
        return null
    }

    override fun cancelFood(selectedFood: Food?) {
        for(order in selectedHotel?.orderList!!){
            for(food in order){
                if(food?.foodName == selectedFood?.foodName){
                    order.remove(food)
                    println("Food canceled successfully");
                    break
                }
            }
        }
    }

    override fun getHotelName(): String? {
        return selectedHotel?.hotelName
    }

    override fun searchFood() {
        val option : Int? = hotelDisplay.askOptionForSearch()
            when(option){
                1 -> {
                    for(food in selectedHotel?.foodList!!){
                        if(food?.foodType == "Veg"){
                            hotelDisplay.displayFoods(food)
                        }
                    }
                }
                2 -> {
                    for(food in selectedHotel?.foodList!!){
                        if(food?.foodType == "NonVeg"){
                            hotelDisplay.displayFoods(food)
                        }
                    }
                }
            }
        askOption()
    }

    override fun displayFood() {
        for(food in selectedHotel?.foodList!!){
                hotelDisplay.displayFoods(food)
        }
    }

    override fun askOption(): String? {
        val option : Int? = hotelDisplay.askOptionForFood()
        var foodName : String? = null
        when(option) {
            1 -> {
                searchFood()
            }
            2 -> {
                foodName = selectFood()
            }
        }
        return foodName
    }
}