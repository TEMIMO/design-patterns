package com.temimo.behavioral.visitor;

public class JuniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Junior writing class...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Junior writing database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Junior writing test...");
    }
}
