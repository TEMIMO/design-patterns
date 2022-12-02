package com.temimo.facade;

public class RunMe {
    public static void main(String[] args) {
        // Without facade
        Job job = new Job();
        ProblemTracker problemTracker = new ProblemTracker();
        Developer developer = new Developer();

        job.startCheckingJob();
        problemTracker.startWeek();
        developer.doCode(problemTracker);

        problemTracker.endWeek();
        developer.doCode(problemTracker);

        System.out.println("\nAnd now with Facade: \n");
        Facade facade = new Facade();
        facade.workingProcess();
    }
}
