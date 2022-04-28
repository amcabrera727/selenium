package com.syntax.class25;



public class Task1 {
    public static void main(String[] args) {

        Lenovo lenovo = new Lenovo("Lenovo");
        lenovo.login();
        HP hp = new HP("HP");
        hp.login();
        Computer[] computers = {new Lenovo("Lenovo"), new HP("HP"), new Apple("Apple")};
        for (Computer c : computers
        ) {
            c.login();
        }
    }
}