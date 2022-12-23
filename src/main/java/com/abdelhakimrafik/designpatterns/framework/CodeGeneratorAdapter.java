package com.abdelhakimrafik.designpatterns.framework;

import com.abdelhakimrafik.designpatterns.diagram.Diagram;

public class CodeGeneratorAdapter implements CodeGenerator {

    private OldCodeGenerator oldCodeGenerator;

    private OldCodeGenerator getOldCodeGenerator() {
        return this.oldCodeGenerator;
    }

    private void setOldCodeGenerator(OldCodeGenerator oldCodeGenerator) {
        this.oldCodeGenerator = oldCodeGenerator;
    }

    @Override
    public String generate(Diagram diagram) {
        return null;
    }
}
