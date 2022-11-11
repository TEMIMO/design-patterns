package com.temimo.creational.abstractFactory.javaTeam;

import com.temimo.creational.abstractFactory.AbstractFactory;

public class JavaDeveloperFactory implements AbstractFactory {
    @Override
    public JavaDeveloper makeProgrammer() {
        return new JavaDeveloper();
    }
}
