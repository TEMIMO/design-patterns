package com.temimo.behavioral.chain;

public class AdminRole extends Role {

    public AdminRole(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Admin action: " + message);
    }
}
