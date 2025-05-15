package com.pluralsight;

public class House extends Asset{

    //PROPERTIES
    private String address;
    private int condition; //1- excellent, 2- good, 3 -fair, 4-poor
    private int squareFoot;
    private int lotSize;

    //constructor from Super class
    public House(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);

    }

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double pricePerSqFt =0;

        switch (condition) {
            case 1: //excellent
                pricePerSqFt=180;
                break;
            case 2: //good
                pricePerSqFt = 130;
                break;
            case 3:  //fair
                pricePerSqFt=90;
                break;
            case 4:
                pricePerSqFt =80.00;
                break;
        }
        //calculate the value of the house based on its square foot and condition
        double houseValue = squareFoot * pricePerSqFt;

        //calculate the value of the house based on lot size(25 cents per square foot)
        double lotValue =lotSize * 0.25;

        //total value is the sum of house value and lot value
        return houseValue + lotValue;
    }


}
