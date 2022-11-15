package com.temimo.creational.prototype;

public class JavaProgrammer implements Copyable{

    private Integer salary;

    public JavaProgrammer(Integer salary) {
        this.salary = salary;
    }

    @Override
    public JavaProgrammer copy() {
        return new JavaProgrammer(this.salary);
    }

    public Integer getSalary() {
        return this.salary;
    }
}
