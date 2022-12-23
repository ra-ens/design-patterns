package com.abdelhakimrafik.designpatterns.diagram;

public class Record extends Entity {
    private Constructor constructor;
    public Record(String name, Constructor constructor) {
        super(name);
        this.constructor = constructor;
    }
    public Constructor getConstructor() {
        return constructor;
    }
    public void setConstructor(Constructor constructor) {
        this.constructor = constructor;
    }
}
