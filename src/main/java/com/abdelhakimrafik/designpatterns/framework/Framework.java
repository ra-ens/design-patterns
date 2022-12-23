package com.abdelhakimrafik.designpatterns.framework;

import com.abdelhakimrafik.designpatterns.diagram.Diagram;

public class Framework {

    private CodeGenerator generator;

    private Serializer serializer;


    private void setSerializer(Serializer serializer) {
        this.serializer = serializer;
    }

    private void setGenerator(CodeGenerator generator) {
        this.generator = generator;
    }

    String generate(Diagram diagram) {
        return null;
    }

    void export(String name, Diagram diagram) {

    }
    
}
