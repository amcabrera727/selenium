package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo4 {

    public static void main(String[]args){

        ArrayList<String> fruits=new ArrayList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        ArrayList<String> vegetables=new ArrayList<>();
        vegetables.add("potato");
        vegetables.add("onion");
        vegetables.add("carrot");

        ArrayList<String> groceries = new ArrayList<>();
        groceries.addAll(fruits);
        groceries.addAll(vegetables);
        System.out.println(groceries);


        ArrayList<String> itemsToBeRemoved = new ArrayList<>();
        itemsToBeRemoved.add("Apple");
        itemsToBeRemoved.add("onion");

        groceries.removeAll(itemsToBeRemoved);
        System.out.println(groceries);

    }
}
