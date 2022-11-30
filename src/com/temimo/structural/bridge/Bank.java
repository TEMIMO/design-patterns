package com.temimo.structural.bridge;

public abstract class Bank {
    Developer developer;

    public Bank(Developer developer) {
        this.developer = developer;
    }

    public abstract void developBank();
}
