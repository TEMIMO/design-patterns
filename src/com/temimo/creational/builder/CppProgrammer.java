package com.temimo.creational.builder;

public class CppProgrammer extends ProgrammerBuilder{
    @Override
    void buildName() {
        programmer.setName("Xz");
    }

    @Override
    void buildSalary() {
        programmer.setSalary(50000);
    }
}
