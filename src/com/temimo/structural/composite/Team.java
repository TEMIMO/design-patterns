package com.temimo.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Developer {
    private List<Developer> developerList = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        developerList.add(developer);
    }

    public void deleteDeveloper(Developer developer) {
        developerList.remove(developer);
    }

    @Override
    public void doCode() {
        System.out.println("Start creating project...");
        developerList.forEach(Developer::doCode);
    }
}
