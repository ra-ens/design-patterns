package com.abdelhakimrafik.designpatterns.diagram;


import java.util.ArrayList;
import java.util.List;

public class Diagram {
    private List<Entity> entities;
    private List<Relation> relations;
    public Diagram(List<Entity> entities, List<Relation> relations) {
        this.entities = entities;
        this.relations = relations;
    }
    public Diagram() {
        this.entities = new ArrayList<>();
        this.relations = new ArrayList<>();
    }
    public void addEntity(Entity entity) {
        this.entities.add(entity);
    }
    public boolean removeEntity(Entity entity) {
        return this.entities.remove(entity);
    }
    public void addRelation(Relation relation) {
        this.relations.add(relation);
    }
    public boolean removeRelation(Relation relation) {
        return this.relations.remove(relation);
    }
}
