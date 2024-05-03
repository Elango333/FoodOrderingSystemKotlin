package com.HotelAdmin

import com.Food.Food
import com.Hotel.Hotel

class HotelAdminFunctionality(var hotel : Hotel?) : HotelAdminFuncInterface{
    private var adminDisplay = HotelAdminDisplay()
    override fun addFood() {
        val food : Food? = adminDisplay.addFoodToList()
        hotel?.foodList?.add(food)
        println("Food added successfully");
    }

    override fun removeFood() {
        val foodName : String? = adminDisplay.removeFoodFromList()
        var removeFood : Food? = null
        for(food in hotel?.foodList!!){
            if(food!!.foodName == foodName){
               removeFood = food
            }
        }
        hotel?.foodList?.remove(removeFood)
        println("Food removed successfully");
    }

    fun showFeatures(){
    val option : Int? = adminDisplay.askOptionForHotelAdmin()
        when(option){
            1 -> {
                addFood()
                showFeatures()
            }
            2 -> {
                removeFood()
                showFeatures()
            }
            3 -> {

            }
        }
    }
}