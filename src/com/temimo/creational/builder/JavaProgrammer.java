package com.temimo.creational.builder;

public class JavaProgrammer extends ProgrammerBuilder{

    @Override
    void buildName() {
        programmer.setName("Artemy");
    }

    @Override
    void buildSalary() {
        programmer.setSalary(150000);
    }
}
