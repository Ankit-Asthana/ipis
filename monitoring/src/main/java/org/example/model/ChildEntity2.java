package org.example.model;

import jakarta.persistence.Entity;
import org.example.model.BaseEntity;

@Entity
public class ChildEntity2 extends BaseEntity {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    // additional attributes and methods
    
    // getters and setters
}
