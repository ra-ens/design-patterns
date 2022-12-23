package com.abdelhakimrafik.designpatterns.diagram;

public class Element<T> {
    private T entity;

    public T getEntity() {
        return this.entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }
}
