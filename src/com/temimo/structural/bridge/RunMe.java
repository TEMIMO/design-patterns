package com.temimo.structural.bridge;

import java.util.ArrayList;
import java.util.List;

public class RunMe {
    public static void main(String[] args) {
        List<Bank> banks = new ArrayList<>();

        banks.add(new SberBank(new JavaDeveloper()));
        banks.add(new TinkoffBank(new CppDeveloper()));

        banks.add(new SberBank(new CppDeveloper()));
        banks.add(new TinkoffBank(new JavaDeveloper()));

        banks.forEach(Bank::developBank);

    }
}
