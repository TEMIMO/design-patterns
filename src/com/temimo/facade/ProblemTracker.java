package com.temimo.facade;

public class ProblemTracker {
    private boolean hasProblem;

    public boolean isHasProblem() {
        return hasProblem;
    }

    public void startWeek() {
        hasProblem = true;
        System.out.println("Start of developer's week...");
    }

    public void endWeek() {
        hasProblem = false;
        System.out.println("End of developer's week...");
    }
}
