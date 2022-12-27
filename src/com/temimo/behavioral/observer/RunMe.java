package com.temimo.behavioral.observer;

public class RunMe {
    public static void main(String[] args) {
        JavaDeveloperJobSite javaDeveloperJobSite = new JavaDeveloperJobSite();

        javaDeveloperJobSite.addVacancy("Java vacancy 1");
        javaDeveloperJobSite.addVacancy("Java vacancy 2");

        Observer subscriber1 = new Subscriber("Artemy");
        Observer subscriber2 = new Subscriber("Vika");

        javaDeveloperJobSite.addObserver(subscriber1);
        javaDeveloperJobSite.addObserver(subscriber2);

        javaDeveloperJobSite.addVacancy("Java vacancy 3");
    }
}
