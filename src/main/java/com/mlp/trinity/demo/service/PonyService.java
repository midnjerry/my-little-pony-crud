package com.mlp.trinity.demo.service;

import com.mlp.trinity.demo.models.Pony;
import com.mlp.trinity.demo.repository.PonyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PonyService {

    private PonyRepository ponyRepository;
    @Autowired
    public PonyService(PonyRepository ponyRepository){
        this.ponyRepository = ponyRepository;
    }

    public List<Pony> getAllPonys() {
        return ponyRepository.findAll();
    }
}
