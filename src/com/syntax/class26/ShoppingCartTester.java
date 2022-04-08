package com.syntax.class26;

import org.openqa.selenium.WebDriver;

public class ShoppingCartTester {
    public static void main(String[]args){

        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.calculatePrice();
       shoppingCart.originalPrice=100;
        shoppingCart.calculatePrice();

    }

    }

