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
public class Controller{
    RegisterAsDriver obj=new RegisterAsDriver();
    RegisterAsPass obj2=new RegisterAsPass();
    Data obj3=new Database();
    Login obj4=new Login();

    @PostMapping("/RegisterAsDriver/add")
    public void registerAsDriver(@PathVariable String username,@PathVariable String pass,@PathVariable String email,@PathVariable long mobile,@PathVariable String licence,@PathVariable long nationalID){
        obj.setUserName(username);
        obj = new RegisterAsDriver(username, pass, email, mobile, licence, nationalID);
        obj3.setPending_drivers(obj);
    }

    @PostMapping("/RegisterAsPassenger/add")
    public void registerAsPass(@PathVariable String username,@PathVariable String pass,@PathVariable String email,@PathVariable long mobile,@PathVariable String dateOfBirth){
        obj2.setUserName(username);
        obj2 = new RegisterAsPass(username, pass, email, mobile,dateOfBirth);
        obj3.setPassUsingSystem(obj2);
    }

    @GetMapping("/LoginAsDriver")
    public boolean LoginAsDriver(@PathVariable String username,@PathVariable String pass_word){
        if(obj4.check_driver(username, pass_word)){
            System.out.println("Logined successfully");
            return true;
        }
        return false;
    }
}

    @GetMapping("/LoginAsPassenger")
    public boolean LoginAsPassenger(@PathVariable String username,@PathVariable String pass_word){
        if(obj4.check_pass(username, pass_word)){
            System.out.println("Logined successfully");
            return true;
        }
        return false;
    }
    @GetMapping("/Admin")
    public boolean LoginAsAdmin(@PathVariable String username,@PathVariable String pass_word){
        if (obj4.check_Admin(username, pass_word)==true){
            System.out.println("Logined successfully");
            return true;
        }
        return false;
    }
}
}
