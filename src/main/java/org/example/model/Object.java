package org.example.model;

public class Object {

    private String name;
    private String description;
    private String type;

    /**
     * Constructor for the Object Class
     * @param name String
     * @param description String
     */
    public Object(String name,String description,String type){
        this.name = name;
        this.description = description;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }
}
