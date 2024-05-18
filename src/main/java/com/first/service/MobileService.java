package com.first.service;

import com.first.entity.Mobile;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MobileService  {

     Mobile findByID(int emei);
     List<Mobile> findAll();
     //Mobile save(Mobile mobile);
    //void deleteById();
}
