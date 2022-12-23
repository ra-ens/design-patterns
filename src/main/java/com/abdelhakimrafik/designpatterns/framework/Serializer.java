package com.abdelhakimrafik.designpatterns.framework;

import com.abdelhakimrafik.designpatterns.diagram.Diagram;

public interface Serializer {

    void export(String name, Diagram diagram);
}
