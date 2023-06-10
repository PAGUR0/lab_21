package com.company;

import java.util.ArrayList;
import java.util.List;

class User implements Listener{
    private String name;
    private List<Group> groupList;

    public User(String name) {
        this.name = name;
        this.groupList = new ArrayList<>();
    }

    public void subscribe(Group group) {
        groupList.add(group);
        group.subscribe(this);
    }

    public void unsubscribe(Group group) {
        groupList.remove(group);
        group.unsubscribe(this);
    }

    @Override
    public void update(String str) {
        System.out.println(this.name + ": " + str);
    }
}
