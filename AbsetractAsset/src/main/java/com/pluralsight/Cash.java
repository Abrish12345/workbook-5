package com.pluralsight;

public  class Cash extends Asset {
    public Cash(String description, String dateAcquired, double amount) {
        super(description, dateAcquired, amount);  //call the constructor of super class and sends value to it
    }

    @Override
    public double getValue() {
        return getOriginalCost();
    }
}
