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
public class Driver_Controller {
    ArrivedLocation obj8=new ArrivedLocation();
    ArrivedDestination obj7=new ArrivedDestination();
    PutPrice obj6=new PutPrice();
    Driver obj=new Driver();
    Offer obj2=new Offer();
    Passenger obj3=new Passenger();
    Data obj4=new Database();
    Rating obj5=new RateDriver();

    @PostMapping("{/Driver/FAV/add}")
    public void setFAV(@PathVariable String FAV){
//System.out.print("Enter the number of FAV. areas U want to enter ,please: ");
//                int count = input.nextInt();
//                String FAV;
//                for (int i = 0; i < count; i++) {
//                    FAV = input.next();
        obj.setFavAreas(FAV);
//                }
    }

    @GetMapping("{/Driver/FAVS}")
    public ArrayList<String>getFAV(){
        return obj.getFavAreas();
    }

    @GetMapping("{/Driver/AllMatchedSrcAreas}")
    public ArrayList<String>getSrcAreas(){
        return obj.getSrcAreaList()
    }

    @PostMapping("{/Driver/Offer/add}")
    public void setOffer(@PathVariable double offer){
        obj2.setPrice(offer);
    }

    @GetMapping("{/Driver/Notifications}")
    public void getNoti(){
        obj3.Notify_Driver();
    }


    @GetMapping("{/Driver/AllRatings}")
    public ArrayList<String>getAllRatings(){
        return obj4.getRatings()
    }

    @GetMapping("{/Driver/AverageRatings}")
    public void getAverage(){
        obj5.displayAverageRating();
    }
    @PostMapping({"/Passenger/ArrivedLocation"})
    public void ArrivedLocation(@PathVariable boolean status){
        obj8.isArrivedLocation(status);
    }
    @PostMapping({"/Passenger/ArrivedDestination"})
    public void ArrivedDes(@PathVariable boolean status){
        obj7.isArrivedDestination(status);
    }
    @PostMapping({"/Passenger/ArrivedLocation"})
    public void putPrice(@PathVariable double price){
        obj6.putPrice(price);
    }

}
