package com.Home

import com.Customer.Customer
import com.MainPage.CustomerMainPage
import com.Order.Orders


    public fun main(){
        val mainPage =  CustomerMainPage()
        val customerList = ArrayList<Customer>()
        val ordersList = ArrayList<Orders>()
        val redirectPage = RedirectToLoginPage(mainPage, customerList, ordersList)
        redirectPage.callMenu();
    }

