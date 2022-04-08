package com.syntax.class25;

    class Computer{
        String make;
        Computer(String make){
            this.make=make;
        }
        void login(){
            System.out.println("Use username and password to login");
        }

    }
    class Apple extends Computer{

        Apple(String make) {
            super(make);
        }

        @Override
        void login() {
            System.out.println("use fingerprint to login as well");
        }
    }
    class Lenovo extends Computer{

        Lenovo(String make) {
            super(make);
        }

        @Override
        void login() {
            System.out.println("use windows Hello as well to login");
        }
    }

    class HP extends Computer{

        HP(String make) {
            super(make);
        }

    }

