package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import org.example.model.BaseEntity;

@Entity
@PrimaryKeyJoinColumn(name = "child_entity_id")
public class ChildEntity extends BaseEntity {
    private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
    
    // getters and setters
}
