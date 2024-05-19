package com.first.service;

import com.first.entity.Mobile;
import com.first.repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobileServiceImpl implements MobileService {

    @Autowired
    public MobileRepository repository;
    @Override
    public Mobile findByID(int emei) {
        return repository.findById(emei).get();
    }

    @Override
    public List<Mobile> findAll() {
        return repository.findAll();
    }

    @Override
    public Mobile save(Mobile mobile) {
        return repository.save(mobile);
}

    @Override
    public void delete(int emei) {
         repository.deleteById(emei);
    }
}
