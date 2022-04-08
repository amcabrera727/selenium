package com.syntax.Class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo1 {
    public static void main (String[]args){

        HashMap<String,Double> fruitMap = new HashMap<>();
        //put method is used for maps instead of add
        // fruitMap.put("Apple",20.0); //due to casting does not work in collections and maps
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Apple", 15.6);
        fruitMap.put("Orange", 1.2);
        fruitMap.put("Kiwi", 103.2);
        fruitMap.put("Mango", 22.2);
        fruitMap.put("Pineapple", 10.2);

        Set<String> keys=fruitMap.keySet();
        System.out.println(keys);

        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()){
            if(iterator.next().contains("e")){
                iterator.remove();
            }
        }
        System.out.println(fruitMap);


    }
}
