package com.temimo.behavioral.chain;

public class SuperAdminRole extends Role {

    public SuperAdminRole(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Superadmin action: " + message);
    }
}
