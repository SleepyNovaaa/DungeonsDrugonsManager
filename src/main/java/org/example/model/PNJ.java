package org.example.model;

public class PNJ {

    private  String name;
    private  String description;
    private  String ocupation;

    public PNJ(String name , String description, String ocupation){

        this.description = description;
        this.name = name;
        this.ocupation = ocupation;

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getOcupation() {
        return ocupation;
    }
}
