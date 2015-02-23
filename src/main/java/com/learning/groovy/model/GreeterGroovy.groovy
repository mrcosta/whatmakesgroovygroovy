package com.learning.groovy.model

/**
 * Created by mcosta on 2/23/15.
 */
class GreeterGroovy {

    String owner

    public String greet(String name) {
        return "Hello $name , I am $owner";
    }
}
