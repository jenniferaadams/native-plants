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
        Plant plant3 = new Plant("Big Bluestem", "Andropogon gerardii", "blue grass with flowers", "Full sun", "moist to dry", "Drought tolerant, can grow in poor soil", "prairies, meadows");
        Plant plant4 = new Plant("Black-Eyed Susan", "Rudbeckia hirta", "Yellow blooms with dark centers", "Full sun, partial sun", "average to dry", "Thrives in poor soil", "meadows, prairies, open woods");
        Plant plant5 = new Plant("Black Snakeroot", "Cimicifuga racemosa", "Wands of white flowers", "Deep shade to filtered light", "average", "Humus-rich woodland soil and shade", "rich woods");

        plantRepo.save(plant1);
        plantRepo.save(plant2);
        plantRepo.save(plant3);
        plantRepo.save(plant4);
        plantRepo.save(plant5);

        State state1 = new State("Alabama");
        State state2 = new State("Alaska");
        State state3 = new State("Arkansas");
        State state4 = new State("Arizona");
        State state5 = new State("California");
        State state6 = new State("Colorado");


        stateRepo.save(state1);
        stateRepo.save(state2);
        stateRepo.save(state3);
        stateRepo.save(state4);
        stateRepo.save(state5);
        stateRepo.save(state6);
    }

}
