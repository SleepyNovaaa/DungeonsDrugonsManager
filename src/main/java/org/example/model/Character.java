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

    public void setStrength(int strength) {
        Strength = strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }
}