package com.abdelhakimrafik.designpatterns.diagram;

import java.util.ArrayList;
import java.util.List;

public class Annotation extends Entity {
    private List<Property> properties;

    public Annotation(String name) {
        super(name);
        this.properties = new ArrayList<>();
    }
    public List<Property> getProperties() {
        return this.properties;
    }
    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }
}
