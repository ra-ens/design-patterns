package com.abdelhakimrafik.designpatterns.diagram;


import com.abdelhakimrafik.designpatterns.diagram.enums.Type;
import com.abdelhakimrafik.designpatterns.framework.Observable;
import com.abdelhakimrafik.designpatterns.framework.Observer;

import java.util.List;

public class Attribute extends StatedEntity implements Observable {
    private Type type;
    private List<Observer> observers;
    public Attribute(String name, Type type) {
        super(name);
        this.type = type;
    }
    public Attribute(String name) {
        super(name);
    }
    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
        this.notifyObservers();
    }
    public List<Observer> getObservers() {
        return observers;
    }
    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer ob :observers) {
            ob.update(this);
        }
    }
}
