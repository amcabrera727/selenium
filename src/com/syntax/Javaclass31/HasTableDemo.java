package com.syntax.class31;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HasTableDemo {
    public static void main (String[]args){

        Hashtable<String, String> students = new Hashtable<>();
        students.put("1", "Anna");
        students.put("2", "Nugget");
        students.put ("3", "Esai");
        students.put("4", "Jayden");
        students.put("5", "Gaby");

        Set<Map.Entry<String, String>> entrySet =students.entrySet();
        for (Map.Entry<String, String> entry:entrySet
             ) {
            System.out.println(entry);
        }

        }
    }

