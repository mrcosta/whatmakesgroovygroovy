package com.learning.groovy.model;

/**
 * Created by mcosta on 2/23/15.
 */
public class Greeter {

    private String owner;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String greet(String name) {
        return "Hello " + name + ", I am " + owner;
    }



}
