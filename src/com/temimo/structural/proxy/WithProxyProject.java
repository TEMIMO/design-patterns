package com.temimo.structural.proxy;

public class WithProxyProject implements Project{
    private String url;
    private WithoutProxyProject withoutProxyProject;

    public WithProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        // В прокси здесь можно использовать какое-то дополнительное действие, например, сохранение в кеш
        if (withoutProxyProject == null) {
            withoutProxyProject = new WithoutProxyProject(url);
        }
        withoutProxyProject.run();
    }
}
