package com.temimo.structural.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator{
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeDeploy() {
        return "I'm making deploy.";
    }

    @Override
    public String doCode() {
        return super.doCode() + makeDeploy();
    }
}
