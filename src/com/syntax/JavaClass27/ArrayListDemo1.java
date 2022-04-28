package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[]args){

        ArrayList<Double> numberList=new ArrayList<>(); //double starts witha  capital D
        //primitive data types don't work with collections framework
        Double double1= new Double( 10.5);
        double number =double1.doubleValue(); //unboxing
        Double number2= new Double(number); //boxing
        double number3=10.5; // called autoboxing
        double number4=number3;

    }
}
