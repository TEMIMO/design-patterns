package com.temimo.creational.prototype;

public class RunMe {
    public static void main(String[] args) {
        JavaProgrammer javaProgrammerPrototype = new JavaProgrammer(150000);
        System.out.println(javaProgrammerPrototype.getSalary());

        JavaProgrammer copyJavaProgrammer = javaProgrammerPrototype.copy();
        System.out.println(copyJavaProgrammer.getSalary());
    }
}
