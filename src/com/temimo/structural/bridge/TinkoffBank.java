package com.temimo.structural.bridge;

public class TinkoffBank extends Bank{

    public TinkoffBank(Developer developer) {
        super(developer);
    }

    @Override
    public void developBank() {
        System.out.println("Tinkoff developing in progress");
        developer.doCode();
    }
}
