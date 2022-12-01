package com.temimo.structural.decorator;

public class DeveloperDecorator implements Developer{

    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String doCode() {
        return developer.doCode();
    }
}
