package com.temimo.structural.facade;

public class Facade {
    Job job = new Job();
    ProblemTracker problemTracker = new ProblemTracker();
    Developer developer = new Developer();

    public void workingProcess() {
        job.startCheckingJob();
        problemTracker.startWeek();
        developer.doCode(problemTracker);

        problemTracker.endWeek();
        developer.doCode(problemTracker);
    }
}
