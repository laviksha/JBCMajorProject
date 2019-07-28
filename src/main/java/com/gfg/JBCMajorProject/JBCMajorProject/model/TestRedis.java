package com.gfg.JBCMajorProject.JBCMajorProject.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class TestRedis implements Serializable {

    private int id;
    private String name;

    public TestRedis() {
    }

    public TestRedis(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
