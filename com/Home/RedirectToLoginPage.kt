package com.Home

import com.Customer.Customer
import com.Customer.CustomerFunctionality
import com.DeliveryBoy.DeliveryBoy
import com.DeliveryBoy.DeliveryBoyFunctionality
import com.Hotel.Hotel
import com.Hotel.HotelFunctionality
import com.HotelAdmin.HotelAdminFunctionality
import com.MainPage.CustomerMainPage
import com.MainPage.CustomerMainPageFunctionality
import com.Order.Orders

class RedirectToLoginPage(var mainpage: CustomerMainPage,var customerList: ArrayList<Customer>,var deliveryOrderList: ArrayList<Orders>) {
    private var homepageDisplay = HomePageDisplay();

    fun callMenu(){
        while (showHomePageMenu()){
        }
    }

    fun showHomePageMenu() : Boolean {
        var customer = Customer()
        val option : Int? = homepageDisplay.showHomePageMenu()
        when(option) {
            1 -> {
                val optionForLogin: Int? = homepageDisplay.askOptionForLogin()
                    when(optionForLogin){
                        1 -> {
                            val name : String? = homepageDisplay.customerLogin()
                            for(cus in customerList){
                                if(cus.name == name){
                                    customer = cus
                                    break
                                }
                            }
                        }
                        2 -> {
                            customer = homepageDisplay.customerSignin()
                            customerList.add(customer)
                        }
                    }
                val customerMainPage = CustomerMainPageFunctionality(mainpage.hotelList)
                val selectedHotel = customerMainPage.askOption()
                val hotelFunc = HotelFunctionality(selectedHotel)
                val customerFunc = CustomerFunctionality(customer, hotelFunc, deliveryOrderList)
                customerFunc.showFeatures()
            }
            2 -> {
                val newHotel: Hotel? = homepageDisplay.createHotel()
                mainpage.hotelList.add(newHotel)
                val hotelAdminFunc = HotelAdminFunctionality(newHotel)
                hotelAdminFunc.showFeatures()
                 }
            3 ->
             {
                 val deliveryBoy = DeliveryBoy(deliveryOrderList)
                 val deliveryBoyFunc = DeliveryBoyFunctionality(deliveryBoy)
                 deliveryBoyFunc.showFeatures()
            }
            4 ->
            {
                return false
            }
        }
        return true
    }
}