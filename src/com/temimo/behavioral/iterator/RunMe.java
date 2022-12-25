package com.temimo.behavioral.iterator;

public class RunMe {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernte"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Artemy", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer name: " + javaDeveloper.getName());

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }
}
