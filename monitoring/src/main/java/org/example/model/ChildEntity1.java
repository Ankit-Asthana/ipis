package org.example.model;

import jakarta.persistence.Entity;
import org.example.model.BaseEntity;

@Entity
public class ChildEntity1 extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    // additional attributes and methods
    
    // getters and setters
}




