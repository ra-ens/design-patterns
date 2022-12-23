package com.abdelhakimrafik.designpatterns.diagram;

public class Entity {
    protected String name;

    public Entity(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
