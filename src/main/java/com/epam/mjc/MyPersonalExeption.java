package com.epam.mjc;

public class MyPersonalExeption extends IllegalArgumentException {
    public MyPersonalExeption(long id) {
        super(String.format("Could not find student with ID %d",id));
    }
}
