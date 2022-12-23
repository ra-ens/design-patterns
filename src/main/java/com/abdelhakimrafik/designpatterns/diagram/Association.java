package com.abdelhakimrafik.designpatterns.diagram;

public class Association extends Relation {
    private Element<Class> source;
    private Element<Entity> destination;
    public Element<Class> getSource() {
        return this.source;
    }
    public void setSource(Element<Class> source) {
        this.source = source;
    }
    public Element<Entity> getDestination() {
        return this.destination;
    }
    public void setDestination(Element<Entity> destination) {
        this.destination = destination;
    }
}
