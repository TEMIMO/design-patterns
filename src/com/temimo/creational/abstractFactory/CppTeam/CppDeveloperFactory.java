package com.temimo.creational.abstractFactory.CppTeam;

import com.temimo.creational.abstractFactory.AbstractFactory;
import com.temimo.creational.abstractFactory.Developer;

public class CppDeveloperFactory implements AbstractFactory {

    @Override
    public Developer makeProgrammer() {
        return new CppDeveloper();
    }
}
