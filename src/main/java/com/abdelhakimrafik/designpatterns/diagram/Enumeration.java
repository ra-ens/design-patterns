package com.abdelhakimrafik.designpatterns.diagram;

import java.util.ArrayList;
import java.util.List;

public class Enumeration extends Entity {
    private List<String> values;
    public Enumeration(String name, List<String> values) {
        super(name);
        this.values = values;
    }
    public Enumeration(String name) {
        super(name);
        this.values = new ArrayList<>();
    }
    public List<String> getValues() {
        return values;
    }
    public void setValues(List<String> values) {
        this.values = values;
    }
}
