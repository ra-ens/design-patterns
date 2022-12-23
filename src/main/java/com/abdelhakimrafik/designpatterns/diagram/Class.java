package com.abdelhakimrafik.designpatterns.diagram;

import java.util.List;

public class Class extends StatedEntity {
    private boolean isAbstract;
    private List<Constructor> constructors;
    private List<StatedEntity> childs;
    public Class(String name, boolean isAbstract, List<Constructor> constructors, List<StatedEntity> childs) {
        super(name);
        this.isAbstract = isAbstract;
        this.constructors = constructors;
        this.childs = childs;
    }
    public Class(String name) {
        super(name);
    }
    public boolean isAbstract() {
        return isAbstract;
    }
    public void setAbstract(boolean anAbstract) {
        isAbstract = anAbstract;
    }
    public List<Constructor> getConstructors() {
        return constructors;
    }
    public void setConstructors(List<Constructor> constructors) {
        this.constructors = constructors;
    }
    public List<StatedEntity> getChilds() {
        return childs;
    }
    public void setChilds(List<StatedEntity> childs) {
        this.childs = childs;
    }
}
