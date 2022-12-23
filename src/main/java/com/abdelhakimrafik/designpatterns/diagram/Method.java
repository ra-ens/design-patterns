package com.abdelhakimrafik.designpatterns.diagram;

import com.abdelhakimrafik.designpatterns.diagram.enums.Type;

import java.util.ArrayList;
import java.util.List;

public class Method extends StatedEntity {
    private List<Parameter> parameters;
    private Type returnType;
    public Method(String name, List<Parameter> parameters, Type returnType) {
        super(name);
        this.parameters = parameters;
        this.returnType = returnType;
    }
    public Method(String name) {
        super(name);
        this.parameters = new ArrayList<>();
    }
    public List<Parameter> getParameters() {
        return parameters;
    }
    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }
    public Type getReturnType() {
        return returnType;
    }
    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }
}
