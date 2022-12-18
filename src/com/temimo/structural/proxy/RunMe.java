package com.temimo.structural.proxy;

public class RunMe {
    public static void main(String[] args) {
        Project project = new WithoutProxyProject("cool");
        project.run();

        Project project1 = new WithProxyProject("cool");
        project1.run();
    }
}
