package com.temimo.creational.abstractFactory;

import com.temimo.creational.abstractFactory.CppTeam.CppDeveloperFactory;
import com.temimo.creational.abstractFactory.javaTeam.JavaDeveloperFactory;

public class RunMe {
    public static void main(String[] args) {
        AbstractFactory javaDeveloperFactory = new JavaDeveloperFactory();
        Developer javaDev = javaDeveloperFactory.makeProgrammer();
        javaDev.doCode();

        CppDeveloperFactory cppDeveloperFactory = new CppDeveloperFactory();
        Developer cppDev = cppDeveloperFactory.makeProgrammer();
        cppDev.doCode();
    }
}
