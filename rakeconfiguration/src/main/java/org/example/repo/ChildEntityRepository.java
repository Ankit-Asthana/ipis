package org.example.repo;

import org.example.model.ChildEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildEntityRepository extends JpaRepository<ChildEntity, Integer>{

}
