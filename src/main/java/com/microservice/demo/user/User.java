package com.microservice.demo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@ApiModel(description="All details about the user")
public class User {
    private Integer id;

    @Size(min=2, message="Name should have at least 2 characters")
    @ApiModelProperty(notes="Name should have at least two characters")
    private String  name;

    @Past
    @ApiModelProperty(notes="Birthday should be in the past")
    private Date    birthDate;

    protected User() {}

    public User(final Integer id, final String name, final Date birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(final Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", birthDate=" + birthDate + '}';
    }
}
