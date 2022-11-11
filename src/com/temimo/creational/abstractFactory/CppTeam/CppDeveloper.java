package com.temimo.creational.abstractFactory.CppTeam;

import com.temimo.creational.abstractFactory.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void doCode() {
        System.out.println("Do Cpp code");
    }
}
