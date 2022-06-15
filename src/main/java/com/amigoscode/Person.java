package com.amigoscode;

import lombok.Data;

@Data
public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }
}
