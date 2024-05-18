package com.first.controller;

import com.first.entity.Mobile;
import com.first.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mobile")
public class MobileController {

    @Autowired
    public MobileService mobileService;

    @GetMapping("/{emei}")
    public Mobile getMobileDetailsById(@PathVariable int emei){
        return mobileService.findByID(emei);
    }

    @GetMapping("/all")
    public List<Mobile> getAllMobileDetails(){
        return mobileService.findAll();
    }
}
