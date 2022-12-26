package com.temimo.behavioral.mediator;

public class RunMe {
    public static void main(String[] args) {

        // Посредник представляет собой объект, который представляет собой способ взаимодействия множества объектов
        // между собой и слабой связи между ними. В данном кейсе посредник есть simpleTextChat, а объекты - юзеры и админ

        SimpleTextChat simpleTextChat = new SimpleTextChat();
        User admin = new Admin(simpleTextChat, "Admin");
        User user1 = new SimpleUser(simpleTextChat, "User1");
        User user2 = new SimpleUser(simpleTextChat, "User2");

        simpleTextChat.setAdmin(admin);
        simpleTextChat.addUser(user1);
        simpleTextChat.addUser(user2);

        user1.sendMessage("Hello, i am user 1");
    }
}
