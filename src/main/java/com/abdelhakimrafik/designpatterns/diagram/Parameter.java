package com.abdelhakimrafik.designpatterns.diagram;

import com.abdelhakimrafik.designpatterns.diagram.enums.Type;

public class Parameter {

    private String name;
    private Type type;

    public Parameter(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public Parameter() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
