package com.example.demo.controller;
import com.example.demo.service.empservice;
import com.example.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class empcontroller {
    @Autowired
    private empservice Service;
    @GetMapping("/home")
    public String home(){
        return "index";
    }
    @GetMapping("/aemp")
    public String aem(){
        return "addemp";
    }
    @PostMapping("/register")
    public String empp(@ModelAttribute Employee p){

        Service.addemp(p);
        return "addemp";
    }
}

