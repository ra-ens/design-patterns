package com.abdelhakimrafik.designpatterns.framework;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
