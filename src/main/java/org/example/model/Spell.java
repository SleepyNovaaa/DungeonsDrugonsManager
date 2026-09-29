package org.example.model;

public class Spell {

    private String name;
    private int level;
    private String description;

    public Spell(String name,int level,String description){
        this.description = description;
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }
}
