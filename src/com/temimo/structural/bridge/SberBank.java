package com.temimo.structural.bridge;

public class SberBank extends Bank{

    public SberBank(Developer developer) {
        super(developer);
    }

    @Override
    public void developBank() {
        System.out.println("Sberbank developing in progress");
        developer.doCode();
    }
}
