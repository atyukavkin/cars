package com.andrey.test;

public class Drive {

    public static final int HOW_LONG_TO_DRIVE = 10;

    public static void main(String[] args) {

        BMW bmwX3 = new BMW(10, "X3");
        BMW bmwX5 = new BMW(5, "X5");

        bmwX3.drive(HOW_LONG_TO_DRIVE);
        System.out.println("Switch car");
        bmwX5.drive(HOW_LONG_TO_DRIVE);

    }
}
