package com.temimo.behavioral.command;

public class RunMe {
    public static void main(String[] args) {

        // Паттерн позволяет создать для каждого метода свой отдельный объект, и передавать их в конструктор, методы и тд

        Database database = new Database();

        Developer developer = new Developer(
                new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database));

        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();
    }
}
