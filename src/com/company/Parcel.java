package com.company;

public class Parcel {
    String name;

    public Parcel(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
