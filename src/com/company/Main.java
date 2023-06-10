package com.company;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Иван");
        User user2 = new User("Василий");

        Group group1 = new Group("Искусство рыбалки");
        Group group2 = new Group("Мемы");
        Group group3 = new Group("Милые коты");
        Group group4 = new Group("Ивановские холодильники");

        user1.subscribe(group1);
        user1.subscribe(group2);
        user1.subscribe(group3);

        user2.subscribe(group1);
        user2.subscribe(group2);
        user2.subscribe(group3);
        user2.subscribe(group4);

        group1.informUsers("В понедельник ожидается хороший клёв Карася!");
        group2.informUsers("Сообщество удалено");
        group3.informUsers("Утренние коты");
        group4.informUsers("Новая модель холодильника!");
    }
}
