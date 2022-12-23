package com.abdelhakimrafik.designpatterns.diagram;

import com.abdelhakimrafik.designpatterns.diagram.enums.MaxCard;
import com.abdelhakimrafik.designpatterns.diagram.enums.MinCard;

public class Element<T> {
    private T entity;
    private MinCard minCard;
    private MaxCard maxCard;

    public T getEntity() {
        return this.entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }

    public MinCard getMinCard() {
        return minCard;
    }

    public void setMinCard(MinCard minCard) {
        this.minCard = minCard;
    }

    public MaxCard getMaxCard() {
        return maxCard;
    }

    public void setMaxCard(MaxCard maxCard) {
        this.maxCard = maxCard;
    }
}
