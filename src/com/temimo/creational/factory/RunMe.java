package com.temimo.creational.factory;

public class RunMe {

    public static void main(String[] args) {
        String language = "Java";
        Programmer programmer = Factory.createProgrammer(language);
        programmer.writeCode();
    }
}
