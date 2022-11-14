package com.temimo.creational.singleton;

import java.util.Objects;

public class JavaProgrammer {
    private static JavaProgrammer javaProgrammer;
    public final Integer salary = 150000;

    public static synchronized JavaProgrammer getJavaProgrammer(){
        return Objects.requireNonNullElseGet(javaProgrammer, JavaProgrammer::new);
    }

    private JavaProgrammer() {
    };
}
