package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset {

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - year;
        double value = getOriginalCost();
        //age
        if (age <= 3) {
            value -= (value * 0.03 * age);

        } else if (age >= 4 && age <= 6) {
            value -= (value * 0.06 * age);

        } else if (age >= 7 && age <= 10) {
            value -= (value * 0.08 * age);

        } else {
            value = 1000.00;
        }
        if (odometer > 100000 &&
               !(makeModel.contains("honda") || makeModel.contains("toyota"))){
            value -=value * 0.25;
        }
        return value;
    }
}