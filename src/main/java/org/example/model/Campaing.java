package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Campaing {

    private String name;
    private String description;

    private List<Character> characters;
    private List<PNJ> pnjs;
    private List<Monster> monsters;

    public Campaing(String name, String description){
        this.description= description;
        this.name = name;

        this.characters = new ArrayList<>();
        this.monsters = new ArrayList<>();
        this.pnjs = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public List<PNJ> getPnjs() {
        return pnjs;
    }

    public List<Monster> getMonsters() {
        return monsters;
    }
}
