package com.syntax.class26;

import java.util.ArrayList;

public class CollectionsDemo2 {
    public static void main(String[]args){

        ArrayList<String> countries=new ArrayList<>();
        countries.add("USA");
        countries.add("Peru");
        countries.add("Italy");
        countries.add("Canada");
        countries.add("Morocco");
        countries.add("Turkey");

       // System.out.println(countries.get(3)); // I would get italy
        // System.out.println(countries.get(2)); //I would get Peru

        countries.add(3,"Peru");
        System.out.println(countries);
        System.out.println(countries.size());
        countries.remove("Canada");

    }
}
