package com.JA.nativeplants.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Plant {

    @Id
    @GeneratedValue

    private long id;
    private String name;
    private String botName;
    private String description;
    private String sunExp;
    private String moisture;
    private String careTips;
    private String habitat;

    @ManyToMany (mappedBy = "plants")
    private Collection<State> states;

    public Plant(String name, String botName, String description, String sunExp, String moisture, String careTips, String habitat){
        this.name = name;
        this.botName = botName;
        this.description = description;
        this.sunExp = sunExp;
        this.moisture = moisture;
        this.careTips = careTips;
        this.habitat = habitat;
    }

    public Plant(){
    }
    public String getName(){
        return name;
    }
    public String getBotName(){
        return botName;
    }
    public String getDescription(){
        return description;
    }
    public String getSunExp(){
        return sunExp;
    }
    public String getMoisture(){
        return moisture;
    }
    public String getCareTips(){
        return careTips;
    }
    public String getHabitat(){
        return habitat;
    }
    public Collection<State> getStates(){
        return states;
    }
}
