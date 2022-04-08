package com.syntax.class29;

import java.util.ArrayList;

public class Task1Tester {

    public static void main(String[] args) {

        ArrayList<Insurance> insurances = new ArrayList<>();
        insurances.add(new Car("Adam6", "Tesla S"));
        insurances.add(new Pet("Camel Insurance pvt lmt", "cat"));
        insurances.add(new Health("Keiser"));

        for (Insurance i : insurances) {

            i.getQuote();
            i.cancelInsurance();
        }

    }
    }
