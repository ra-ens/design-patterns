package com.abdelhakimrafik.designpatterns.diagram;

import java.util.ArrayList;
import java.util.List;

public class Interface extends Entity {
    private List<AbstractMethod> methods;
    public Interface(String name, List<AbstractMethod> methods) {
        super(name);
        this.methods = methods;
    }
    public Interface(String name) {
        super(name);
        this.methods = new ArrayList<>();
    }
    public List<AbstractMethod> getMethods() {
        return methods;
    }
    public void setMethods(List<AbstractMethod> methods) {
        this.methods = methods;
    }
}
