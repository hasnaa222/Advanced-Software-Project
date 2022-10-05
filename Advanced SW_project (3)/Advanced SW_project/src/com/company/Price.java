package com.company;

public class Price extends PriceRide {
    public void setPrice(double price){
        this.price=obj2.getPrice();
    }
    @Override
    public double getPrice() {
        return price;
    }
}
