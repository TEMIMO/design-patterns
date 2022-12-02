package com.temimo.facade;

public class Developer {
    public void doCode(ProblemTracker problemTracker) {
        if (problemTracker.isHasProblem()) {
            System.out.println("Developer are coding...");
        }
    }
}
