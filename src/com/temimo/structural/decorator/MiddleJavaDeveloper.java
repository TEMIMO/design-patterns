package com.temimo.structural.decorator;

public class MiddleJavaDeveloper extends DeveloperDecorator{
    public MiddleJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "I'm making code review. ";
    }

    @Override
    public String doCode() {
        return super.doCode() + makeCodeReview();
    }
}
