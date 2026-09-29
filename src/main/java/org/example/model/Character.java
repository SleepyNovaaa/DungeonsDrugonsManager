package org.example.model;


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

    private int Strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

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

    public int getStrength() {
        return Strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getWisdom() {
        return wisdom;
    }

}