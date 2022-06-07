package com.JA.nativeplants;

import com.JA.nativeplants.entities.Plant;
import com.JA.nativeplants.entities.State;
import com.JA.nativeplants.repos.PlantRepository;
import com.JA.nativeplants.repos.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    PlantRepository plantRepo;
    @Autowired
    StateRepository stateRepo;

    @Override
    public void run(String... args) throws Exception{
        Plant plant1 = new Plant("Barren Strawberry", "Waldsteinia fragarioides", "Woodland groundcover", "Part Shade", "average to dry", "Prefers soil high in organic matter", "woods and clearings");
        Plant plant2 = new Plant("Bee Balm", "Monarda didyma", "Striking red flowers", "Part shade to full sun", "moist to average", "Moist Soil", "moist woods, moist meadows");

        plantRepo.save(plant1);
        plantRepo.save(plant2);

        State state1 = new State("Alabama");
        State state2 = new State("Alaska");
        State state3 = new State("Arkansas");

        stateRepo.save(state1);
        stateRepo.save(state2);
        stateRepo.save(state3);
    }

}
