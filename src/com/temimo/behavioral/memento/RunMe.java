package com.temimo.behavioral.memento;

public class RunMe {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GithubRepo githubRepo = new GithubRepo();

        System.out.println("Creating new project. Version 1.0");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);

        System.out.println("Saving version 1.0 to GitHub");
        githubRepo.setSave(project.save());

        System.out.println("Updating project on GitHub to 1.0");
        System.out.println();

        Thread.sleep(5000);
        project.setVersionAndDate("Version 2.0");
        System.out.println(project);
        System.out.println("Something went wrong");

        System.out.println("Rolling back to 1.0");
        project.load(githubRepo.getSave());

        System.out.println();
        System.out.println("Project after rollback");
        System.out.println(project);


    }
}
