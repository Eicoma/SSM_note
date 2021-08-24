package com.eicoma.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//使用该注解，将User类注册到Spring容器，装配Bean
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("晴明")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
