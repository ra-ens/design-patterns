package com.abdelhakimrafik.designpatterns.diagram;

import com.abdelhakimrafik.designpatterns.diagram.enums.Visibility;

public class StatedEntity extends Entity {
    protected Visibility visibility;
    protected boolean isStatic;
    protected boolean isFinal;
    public StatedEntity(String name, Visibility visibility, boolean isStatic, boolean isFinal) {
        super(name);
        this.visibility = visibility;
        this.isStatic = isStatic;
        this.isFinal = isFinal;
    }
    public StatedEntity(String name) {
        super(name);
    }

    public Visibility getVisibility() {
        return visibility;
    }
    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }
    public boolean isStatic() {
        return isStatic;
    }
    public void setStatic(boolean aStatic) {
        isStatic = aStatic;
    }
    public boolean isFinal() {
        return isFinal;
    }
    public void setFinal(boolean aFinal) {
        isFinal = aFinal;
    }
}
