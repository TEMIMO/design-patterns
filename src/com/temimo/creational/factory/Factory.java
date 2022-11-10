package com.temimo.creational.factory;

public class Factory {

    public static Programmer createProgrammer(String language) {

        return switch (language) {
            case "Java" -> new JavaProgrammer();
            case "Cpp" -> new CppProgrammer();
            case "Python" -> new PythonProgrammer();
            default -> throw new RuntimeException();
        };

    }

}
