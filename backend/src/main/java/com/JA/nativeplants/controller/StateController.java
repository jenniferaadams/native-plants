package com.JA.nativeplants.controller;


import com.JA.nativeplants.repos.PlantRepository;
import com.JA.nativeplants.repos.StateRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StateController {

    private StateRepository stateRepo;
    private PlantRepository plantRepo;

    public StateController (StateRepository stateRepo, PlantRepository plantRepo) {
        this.stateRepo = stateRepo;
        this.plantRepo = plantRepo;
    }


}
