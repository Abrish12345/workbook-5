package com.pluralsight;

import java.util.ArrayList;

public class TheApp {
    public static void main(String[] args) {
        ArrayList<Asset> assets=new ArrayList<>();

        //add two houses
        assets.add(new House("Villa","2020-04-11",300000,"456 Pine AV",1,2000,8200));
        assets.add(new House("The house","1990-05-09",50000,"789 pine AV",2,4000,9000) );

        //add two vehicle
        assets.add(new Vehicle("Personal use","2023-04-01",25000,"toyota",2021,50000));
        assets.add(new Vehicle("Personal use","2022-06-05",70000,"BMW",2024,20000));
        //add cash asset

        assets.add(new Cash("pocket money","2025-01-01",1000));
        //LOOP through and print the asset info
        for(Asset asset : assets){
            //print common asset details
            System.out.println( "Description: " + asset.getDescription());
            System.out.println( "Date Acquired: " + asset.getDateAcquired());
            System.out.println( "Original cost: " + asset.getOriginalCost());
            System.out.println( "Current Value: " + asset.getValue());
    if(asset instanceof House house){
      //  House house= (House) asset;
        System.out.println (house.getAddress());
    }else if(asset instanceof Vehicle car){

        System.out.println("Year: " + car.getYear());
        System.out.println("Make Model: " + car.getMakeModel());
    }else if (asset instanceof Cash cash){
        System.out.println("cash value is : " + cash.getOriginalCost());

    }

        }

      //  Asset asset = new Asset("description", "2020-05-01",100000);

        Asset cash = new Cash ("pocket money", "2025-05-13",2000);
        System.out.print(cash.getValue());

       /* House home =new House("Villa","2020-04-11",300000,"456 Pine AV",1,2000,8200);
        Vehicle car = new Vehicle("Personal use","2023-04-01",25000,"toyota",2021,50000);
        System.out.println("House value: $" + home.getValue());
        System.out.println("Vehicle value: $" + car.getValue());

        Vehicle mycar = new Vehicle("Personal use","2022-06-05",70000,"BMW",2024,20000);
      //  *///System.out.println("Vehicle value: $" + mycar.getValue());


    }
}
