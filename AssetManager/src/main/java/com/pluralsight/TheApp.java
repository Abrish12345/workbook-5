package com.pluralsight;

public class TheApp {
    public static void main(String[] args) {

        House home =new House("Villa","2020-04-11",300000,"456 Pine AV",1,2000,8200);
        Vehicle car = new Vehicle("Personal use","2023-04-01",20000,"toyota",2021,50000);
        System.out.println("House value: $" + home.getValue());
        System.out.println("Vehicle value: $" + car.getValue());

    }
}
