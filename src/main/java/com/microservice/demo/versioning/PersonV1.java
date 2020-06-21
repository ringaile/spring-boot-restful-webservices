package com.microservice.demo.versioning;

public class PersonV1 {

    private String name;

    public PersonV1() {
    }

    public PersonV1(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
