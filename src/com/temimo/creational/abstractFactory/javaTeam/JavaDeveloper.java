package com.temimo.creational.abstractFactory.javaTeam;

import com.temimo.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void doCode() {
        System.out.println("Do Java code");
    }
}
