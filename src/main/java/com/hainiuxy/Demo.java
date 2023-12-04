package com.hainiuxy;

import java.util.Objects;

public class Demo {
    public String SayHello(String str) {
        System.out.println("hello " + str);
        return "hello " + str;
    }

    public void start() {
        System.out.println("start");
        System.out.println("debug xxx");
    }

    public boolean login(String username, String password) {
        User user = new User(username, password);
        if (Objects.isNull(user)) {
            return false;
        } else {
            return true;
        }
    }
}
