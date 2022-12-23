package com.abdelhakimrafik.designpatterns.diagram;

public class RelationNoCards extends Relation {

    protected Entity source;

    protected Entity destination;


    public RelationNoCards(String name, Entity source, Entity destination) {
        super(name);
        this.source = source;
        this.destination = destination;
    }

    public RelationNoCards(String name) {
        super(name);
    }

    public RelationNoCards() {

    }

    public Entity getSource() {
        return source;
    }

    public void setSource(Entity source) {
        this.source = source;
    }

    public Entity getDestination() {
        return destination;
    }

    public void setDestination(Entity destination) {
        this.destination = destination;
    }
}
