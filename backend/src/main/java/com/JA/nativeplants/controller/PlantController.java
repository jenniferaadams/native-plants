package com.JA.nativeplants.controller;


import com.JA.nativeplants.repos.PlantRepository;
import com.JA.nativeplants.repos.StateRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlantController {

    private PlantRepository plantRepo;
    private StateRepository stateRepo;

    public PlantController (PlantRepository plantRepo, StateRepository stateRepo) {
        this.plantRepo = plantRepo;
        this.stateRepo = stateRepo;
    }

}
