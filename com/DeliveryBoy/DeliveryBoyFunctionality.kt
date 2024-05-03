package com.DeliveryBoy

class DeliveryBoyFunctionality(var deliveryBoy : DeliveryBoy?) : DeliveryBoyFuncInterface {
    private var deliveryBoyDisplay = DeliveryBoyDisplay()

    override fun deliverFoodToCustomer() {
        for(order in deliveryBoy?.deliveryOrderList!!){
            deliveryBoyDisplay.deliverFoods(order)
        }
    }

    fun showFeatures(){
        val option : Int? = deliveryBoyDisplay.showFeatures()
        when(option){
            1 -> {
                deliverFoodToCustomer()
            }
            2 -> {
            }
        }
    }
}