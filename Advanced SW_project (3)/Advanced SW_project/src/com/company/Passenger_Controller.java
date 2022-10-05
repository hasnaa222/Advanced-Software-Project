package com.company;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import com.company.demo.Core.Person;
import com.company.demo.application.IPeopleService;
import com.company.demo.application.PeopleService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException.NotFound;

@RestController
public class Passenger_Controller{
    RateDriver obj = new RateDriver();
    Data obj3 = new Database();
    Passenger obj2=new Passenger();
    Driver obj4=new Driver();
    Offer obj5=new Offer();
    PutPrice obj6=new PutPrice();
    AcceptPrice obj7=new AcceptPrice();

    @PostMapping({"/Passenger/reqRide"})
    public void requestARide(@PathVariable String source,@PathVariable String destination,@PathVariable int num_pass,@PathVariable long Driver_ID){
        obj4.setSrcAreaList(Source);
        obj2.requestARide(source,destination,num_pass,Driver_ID);
    }
    @PostMapping({"/Passenger/rateDriver"})
    public void rateDriver(@PathVariable int rate,@PathVariable long id){
        obj.rateTheDriver(id, rate);
        obj3.setAllRatingsOfDriver(obj);
    }
    @GetMapping({"/Passenger/displayAverageRatings"})
    public void DisplayAverageRate(){
        obj.displayAverageRating();
    }
    @GetMapping({"/Passenger/NotificationsOfPass"})
    public void ShowNoti(){
        obj5.notify_Passenger();
    }
    @GetMapping({"/Passenger/ShowThePriceOfRide"})
    public double ShowPriceRide(){
        obj6.getPrice();
    }
    @PostMapping({"/Passenger/AcceptPriceOfRide"})
    public void AcceptPriceOfRide(@PathVariable boolean status){
        obj7.Accept_Price(status);
    }
}

