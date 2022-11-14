package com.temimo.creational.singleton;

public class RunMe {
    public static void main(String[] args) {
        JavaProgrammer javaProgrammer = JavaProgrammer.getJavaProgrammer();
        System.out.println(javaProgrammer.salary);
    }
}
