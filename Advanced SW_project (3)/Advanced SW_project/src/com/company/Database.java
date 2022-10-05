package com.company;

import java.util.ArrayList;

public class Database implements Data {

    public void setPassUsingSystem(RegisterAsPass obj){
        passUsingSystem.add(obj);
    }

    public void setAllRatings(int rate){
        ratingDriver.add(rate);
    }
    public ArrayList<Integer> getRatings(){
        return ratingDriver;
    }

    @Override
    public ArrayList<RateDriver> getAllRatingsOfDriver() {
        return AllRatingsOfDriver;
    }

    @Override
    public void setAllRatingsOfDriver(RateDriver obj) {
        AllRatingsOfDriver.add(obj);
    }

    @Override
    public void set_FirstRide(String username) {
        First_Ride.add(username);
    }

    @Override
    public ArrayList<String> get_FirstRide() {
        return First_Ride;
    }

    @Override
    public void setPublicHolidays() {
        PublicHolidays.add("1/1");
        PublicHolidays.add("7/1");
        PublicHolidays.add("25/1");
        PublicHolidays.add("25/4");
        PublicHolidays.add("1/5");
        PublicHolidays.add("2/5");
        PublicHolidays.add("3/5");
        PublicHolidays.add("4/5");
        PublicHolidays.add("5/5");
        PublicHolidays.add("30/6");
        PublicHolidays.add("8/7");
        PublicHolidays.add("9/7");
        PublicHolidays.add("10/7");
        PublicHolidays.add("11/7");
        PublicHolidays.add("12/7");
        PublicHolidays.add("13/7");
        PublicHolidays.add("23/7");
        PublicHolidays.add("29/7");
        PublicHolidays.add("30/7");
        PublicHolidays.add("6/10");
        PublicHolidays.add("7/10");
        PublicHolidays.add("8/10");
    }

    @Override
    public void setDriversHaveRide(long id) {
        DriversHaveRides.add(id);
    }

    @Override
    public ArrayList<Long> getDriversHaveRide() {
        return DriversHaveRides;
    }

    @Override
    public ArrayList<String> getPublicHolidays() {
        return PublicHolidays;
    }

    public void setPending_drivers(RegisterAsDriver obj) {
        this.pending_drivers.add(obj);
    }

    public void setSuspendingAccounts(String account_username) {
        suspendingAccounts.add(account_username);
    }

    public ArrayList<String> getSuspendingAccounts() {
        return suspendingAccounts;
    }

    public void setDriversUsingSystem(RegisterAsDriver obj) {
        driversUsingSystem.add(obj);
    }

    public ArrayList<RegisterAsDriver> getDriversUsingSystem() {
        return driversUsingSystem;
    }

    public ArrayList<RegisterAsDriver> getPending_drivers() {
        return pending_drivers;
    }

    public ArrayList<RegisterAsPass> getPassUsingSystem() {
        return passUsingSystem;
    }
}
