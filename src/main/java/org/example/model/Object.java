package org.example.model;

public class Object {

    private String name;
    private String description;

    /**
     * Constructor for the Object Class
     * @param name String
     * @param description String
     */
    public Object(String name,String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
