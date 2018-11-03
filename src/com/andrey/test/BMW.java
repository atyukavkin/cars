package com.andrey.test;

/**
 * Created by Andrey Tyukavkin on 7/30/2017.
 */
public class BMW implements Car{

    private int millage = 10;
    private String model = "bmw";

    public BMW(int millage, String model) {
        this.millage = millage;
        this.model = model;
    }

    @Override
    public void drive(int howLongToDrive) {
        System.out.println("I'm driving " + getModelName());
        for (int i = 0; i < howLongToDrive; i++) {
            if (i == 0 || i % getMillage() == 0) {
                reFill();
            }
            System.out.print(i + " km ... ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error " + e.getMessage());
            }
        }
    }

    @Override
    public void reFill() {
        System.out.print(" !- Full tank refill -! ");
    }

    @Override
    public int getMillage() {
        return millage;
    }

    @Override
    public String getModelName() {
        return model;
    }


}
