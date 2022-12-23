package com.abdelhakimrafik.designpatterns;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {
    public static void main(String[] args) {
        try {
            new Application().start();
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void start() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
    }
}
