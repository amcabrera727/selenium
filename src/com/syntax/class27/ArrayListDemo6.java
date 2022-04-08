package com.syntax.class27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo6 {

    public static void main (String[]args){

        List<String> groceries = Arrays.asList("apple","banana","carrot");
        //groceries.add("apple");
        //groceries.add("banana");
        //groceries.add("orange");
        //groceries.add("potato");
        //groceries.add("onion");
        //groceries.add("carrot");
        System.out.println(groceries);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("onion");
        //list2.add("pillow");

        System.out.println(groceries.containsAll(list2));


    }
}
