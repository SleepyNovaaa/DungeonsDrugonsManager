package org.example.model;

public class Monster {

    private String name;
    private String type;
    private int health;
    private int armorClass;
    private int dificulty;

    public Monster(String name,String type,int health,int armorClass, int dificulty){

        this.armorClass = armorClass;
        this.dificulty = dificulty;
        this.health = health;
        this.name = name;
        this.type = type;

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public int getHealth() {
        return health;
    }

    public int getDificulty() {
        return dificulty;
    }
}
