package com.temimo.behavioral.template;

public class RunMe {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();
        System.out.println();
        newsPage.showPage();
    }
}
