package com.temimo.structural.decorator;

public class RunMe {
    public static void main(String[] args) {
        Developer developer = new JuniorJavaDeveloper();
        Developer decoratedDeveloper = new MiddleJavaDeveloper(developer);
        Developer strongDecoratedDeveloper = new SeniorJavaDeveloper(decoratedDeveloper);

        String message = developer.doCode();
        System.out.println(message);

        String message1 = decoratedDeveloper.doCode();
        System.out.println(message1);

        String message2 = strongDecoratedDeveloper.doCode();
        System.out.println(message2);
    }
}
