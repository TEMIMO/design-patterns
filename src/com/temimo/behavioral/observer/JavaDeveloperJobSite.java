package com.temimo.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed{

    List<String> vacancies = new ArrayList<>();
    List<Observer> subscrubers = new ArrayList<>();

    public void addVacancy(String vacancy) {
        this.vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy) {
        this.vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscrubers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscrubers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscrubers) {
            observer.handleEvent(this.vacancies);
        }

    }
}
