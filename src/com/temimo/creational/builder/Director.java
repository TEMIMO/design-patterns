package com.temimo.creational.builder;

public class Director {
    public ProgrammerBuilder programmerBuilder;

    public void setProgrammerBuilder(ProgrammerBuilder programmerBuilder) {
        this.programmerBuilder = programmerBuilder;
    }

    public Programmer buildProgrammer() {
        programmerBuilder.buildName();
        programmerBuilder.buildSalary();

        Programmer programmer = programmerBuilder.getProgrammer();
        return programmer;
    }


}
