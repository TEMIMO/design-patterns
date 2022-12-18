package com.temimo.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class RunMe {
    public static void main(String[] args) {
        DeveloperFlyweight developerFlyweight = new DeveloperFlyweight();

        // Добавляем одни и те же 2 объекта из приспособленца, экономя память
        List<Developer> developerList = new ArrayList<>();
        developerList.add(developerFlyweight.getDeveloperBySpeciality("java"));
        developerList.add(developerFlyweight.getDeveloperBySpeciality("java"));
        developerList.add(developerFlyweight.getDeveloperBySpeciality("java"));
        developerList.add(developerFlyweight.getDeveloperBySpeciality("java"));
        developerList.add(developerFlyweight.getDeveloperBySpeciality("java"));
        developerList.add(developerFlyweight.getDeveloperBySpeciality("с++"));

        developerList.forEach(Developer::writeCode);
    }
}
