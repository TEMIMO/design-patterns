package com.temimo.creational.builder;

public abstract class ProgrammerBuilder {
    Programmer programmer;

    void createProgrammer(){
        programmer = new Programmer();
    }

    abstract void buildName();
    abstract void buildSalary();

    Programmer getProgrammer() {
        return programmer;
    }

}
