package com.syntax.class26;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsDemo1 {

    public static void main (String[]args){

        String name="Anna";
        String name2="Nugget";
        //not scalable if we have to store large amount of data
        //arrays can be good option to tackle this problem

        String[]names={"Anna", "Nugget"};

        String[] names2 = new String [1000];
        names2[0] ="Anna";
        names2[2]= "Luis";
        System.out.println(Arrays.toString(names2));
        ArrayList<String> syntaxStudents= new ArrayList<>();
        //ArrayList= > Name of the class
        //<> diamond operator
        //String datatype0

        syntaxStudents.add("Jessica");
        syntaxStudents.add("Gaby");
        syntaxStudents.add("Esai");
        System.out.println(syntaxStudents);
    }
}
