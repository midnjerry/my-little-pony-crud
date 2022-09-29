package com.mlp.trinity.demo.controller;

import com.mlp.trinity.demo.models.Pony;
import com.mlp.trinity.demo.service.PonyService;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
//@RequestMapping("/pony")
public class PonyController {

    private PonyService ponyService;
    public PonyController(PonyService ponyService){
        this.ponyService = ponyService;
    }

    @GetMapping("/pony")
    public List<Pony> getAllPonys(){
        return ponyService.getAllPonys();
    }

     @PostMapping
    public Pony createPonys(@RequestBody Pony pony) {
         return null;
     }
}