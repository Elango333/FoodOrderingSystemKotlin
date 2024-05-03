package com.Customer

import com.Food.Food
import com.Hotel.HotelFuncInterface
import com.Order.Orders

class CustomerFunctionality(var customer : Customer, var hotelFunc : HotelFuncInterface, var deliveryOrderList : ArrayList<Orders>) : CustomerFuncInterface {
    private var cusOrderList : ArrayList<Food?> = ArrayList()
    private var customerDisplay = CustomerDisplay()

    override fun orderFood() {
        hotelFunc.displayFood()
        val foodName : String? = hotelFunc.askOption()
        val food : Food? = hotelFunc.orderFood(foodName)
        cusOrderList.add(food)
        addMoreOrder()
    }

    override fun cancelFood() {
        val foodName: String? = customerDisplay.cancelFood()
        customer.orderList.forEach { order ->
            order.removeAll { food -> food?.foodName == foodName }
        }
    }

    override fun viewOrderDetails() {
        for (order in customer.orderList) {
            for (food in order) {
                customerDisplay.displayOrderList(food)
            }
        }
    }

    fun showFeatures() {
        val option : Int? = customerDisplay.showFeatures()
        when(option){
            1 -> {
                orderFood()
                showFeatures()
            }
            2 -> {
                cancelFood()
                showFeatures()
            }
            3 -> {
                viewOrderDetails()
                showFeatures()
            }
            4 -> {

            }
        }
    }

    fun addMoreOrder(){
        val option : Int? = customerDisplay.askMoreFood()

        when(option){
            1 -> orderFood()
            2 -> {
                customer.orderList.add(cusOrderList)
                val order = Orders()
                order.customerName = customer.name
                order.customerAddress = customer.address
                order.hotelName = hotelFunc.getHotelName()
                order.orderList.add(cusOrderList)
                deliveryOrderList.add(order)
                println("Food ordered successfully")
            }
        }
    }
}
