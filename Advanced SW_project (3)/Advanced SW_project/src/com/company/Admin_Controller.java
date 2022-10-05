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
public class Admin_Controller {
    Admin obj= Admin.getInstance();
    ArrivedLocation obj2=new ArrivedLocation();
    ArrivedDestination obj3=new ArrivedDestination();
    AcceptPrice obj4=new AcceptPrice();
    PutPrice obj5=new PutPrice();

    //@PostMapping({"/ADMIN/Verify"})
    @GetMapping({"/ADMIN/Verify"})
    public void verifyRegistration() {
        obj.verifyRegistration();
    }
    @PostMapping({"/ADMIN/{userName}/Suspend"})
    public void suspendAccount(@PathVariable String userName) {
        obj.suspendAccount(userName);
    }
    @PostMapping({"/ADMIN/{userName}/ActivateACC"})
    public void activateAccount(@PathVariable String userName) {
        obj.activateAccount(userName);
    }
    @GetMapping({"/ADMIN/ArrivedLocEvent"})
    public void isArrivedLoc(){
        obj2.Notify_Admin();
    }
    @GetMapping({"/ADMIN/ArrivedDesEvent"})
    public void isArrivedDes(){
        obj3.Notify_Admin();
    }
    @GetMapping({"/ADMIN/AcceptPriceEvent"})
    public void AcceptPrice(){
        obj4.Notify_Admin();
    }
    @GetMapping({"/ADMIN/PutPriceEvent"})
    public void PutPrice(){
        obj5.Notify_Admin();
    }
}
