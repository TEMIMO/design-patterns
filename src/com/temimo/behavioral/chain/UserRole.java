package com.temimo.behavioral.chain;

public class UserRole extends Role {

    public UserRole(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("User action: " + message);
    }
}
