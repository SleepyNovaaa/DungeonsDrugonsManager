package org.example.model;


import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.List;

public class Character {
    /**
     *
     */
    private String  name;
    private String  race;
    private String CharacterClass;
    private int Level;

    private  int MaxHealth;
    private  int ActualHealth;

    public Character() {

    }
    public Character(String name, String race, String characterClass, int level, int maxHealth, int actualHealth) {
        this.name = name;
        this.race = race;
        CharacterClass = characterClass;
        Level = 1;
        MaxHealth = 10;
        ActualHealth = 10;

    }



    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public String getCharacterClass() {
        return CharacterClass;
    }

    public int getLevel() {
        return Level;
    }

    public int getMaxHealth() {
        return MaxHealth;
    }

    public int getActualHealth() {
        return ActualHealth;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setCharacterClass(String characterClass) {
        CharacterClass = characterClass;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public void setActualHealth(int actualHealth) {
        ActualHealth = actualHealth;
    }

    public void setMaxHealth(int maxHealth) {
        MaxHealth = maxHealth;
    }



}