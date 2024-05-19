package com.first.controller;

import com.first.entity.Mobile;
import com.first.repository.MobileRepository;
import com.first.service.MobileService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mobile")
public class MobileController {

    @Autowired
    public MobileService mobileService;

    @Autowired
    private MobileRepository repository;

    @GetMapping("/{emei}")
    public ResponseEntity<Mobile> getMobileDetailsById(@PathVariable int emei){
        return ResponseEntity.status(HttpStatus.OK).body(mobileService.findByID(emei));
    }

    @GetMapping("/all")
    public  ResponseEntity<List<Mobile>> getAllMobileDetails(){
        return ResponseEntity.status(HttpStatus.OK).body(mobileService.findAll());
    }
   @PostMapping("/save")
    public ResponseEntity<Mobile> saveMobile(@RequestBody Mobile mobile){
       return ResponseEntity.status(HttpStatus.CREATED).body(mobileService.save(mobile));
    }

//    @DeleteMapping("/delete/{emei}")
//    public void getMobilesDetailsById(@PathVariable int emei) {
//        mobileService.delete(emei);
//    }

    @DeleteMapping("/delete/{emei}")
    public Mobile delete(@PathVariable int emei) {
        Mobile mobile = repository.findById(emei).orElseThrow(() -> new EntityNotFoundException("Mobile with EMEI " + emei + " not found"));
        repository.deleteById(emei);
        return mobile;
    }
}
