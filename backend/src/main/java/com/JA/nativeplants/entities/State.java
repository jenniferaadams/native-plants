package com.JA.nativeplants.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class State {
    @Id
    @GeneratedValue
    private long id;
    private String stateName;

    @ManyToMany
    private Collection<Plant> plants;


    public State(String stateName, Plant...plants){
        this.stateName = stateName;
        this.plants = Arrays.asList(plants);
    }

    public State(){
    }

    public long getId(){
        return id;
    }

    public String getStateName(){
        return stateName;
    }

    public Collection<Plant> getPlants(){
        return plants;
    }
}
