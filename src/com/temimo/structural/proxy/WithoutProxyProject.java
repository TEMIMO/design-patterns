package com.temimo.structural.proxy;

public class WithoutProxyProject implements Project{
    private String url;

    public WithoutProxyProject(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println("Loading WithoutProxyProject project...");
    }

    @Override
    public void run() {
        System.out.println("Running WithoutProxyProject project...");
    }
}
