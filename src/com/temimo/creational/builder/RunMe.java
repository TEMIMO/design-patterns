package com.temimo.creational.builder;

public class RunMe {
    public static void main(String[] args) {
        Director director = new Director();

        director.setProgrammerBuilder(new JavaProgrammer());
        Programmer programmer = director.buildProgrammer();

        System.out.println(programmer);
    }
}
