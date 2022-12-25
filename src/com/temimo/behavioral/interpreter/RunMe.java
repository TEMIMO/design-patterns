package com.temimo.behavioral.interpreter;

public class RunMe {
    public static void main(String[] args) {

        // Интерпретатор нужен, чтобы интерпретировать выражение в другом языке, например компьютерном
        // (операции AND/OR и другие) в Java код, т.е. мы засовываем OrExpressiob в Java код

        Expression isJava = getJavaExpression();
        Expression isJavaSpring = getJavaEEExpression();

        System.out.println(isJava.interpret("Java Core"));
        System.out.println(isJavaSpring.interpret("Java Spring"));
    }

    public static Expression getJavaExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");

        return new OrExpression(java, javaCore);
    }

     public static Expression getJavaEEExpression() {
         Expression java = new TerminalExpression("Java");
         Expression javaSpring = new TerminalExpression("Java Spring");

         return new AndExpression(java, javaSpring);
     }
}
