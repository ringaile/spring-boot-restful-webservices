package com.microservice.demo.versioning;

public class PersonV2 {

    private Name name;

    public PersonV2() {
    }

    public PersonV2(final Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setName(final Name name) {
        this.name = name;
    }
}
