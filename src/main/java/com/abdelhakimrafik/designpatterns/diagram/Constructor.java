package com.abdelhakimrafik.designpatterns.diagram;

import java.util.ArrayList;
import java.util.List;

public class Constructor {
    private List<Parameter> parameters;

    public Constructor() {
        this.parameters = new ArrayList<>();
    }

    public List<Parameter> getParameters() {
        return this.parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }
    
}
