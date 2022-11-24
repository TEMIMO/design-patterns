package com.temimo.structural.adapter;

public class RunMe {
    public static void main(String[] args) {
        Database database = new DatabaseAdapter();

        database.create();
        database.read();
        database.update();
        database.delete();
    }

}
