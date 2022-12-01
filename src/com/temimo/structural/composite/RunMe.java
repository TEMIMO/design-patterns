package com.temimo.structural.composite;

public class RunMe {
    public static void main(String[] args) {
        Team team = new Team();

        Developer javaDeveloper1 = new JavaDeveloper();
        Developer javaDeveloper2 = new JavaDeveloper();
        Developer cppDeveloper1 = new CppDeveloper();

        team.addDeveloper(javaDeveloper1);
        team.addDeveloper(javaDeveloper2);
        team.addDeveloper(cppDeveloper1);

        // Суть шаблона - к разным составным элементам компоновщика обращаемся однообразно
        team.doCode();
        javaDeveloper1.doCode();
    }
}
