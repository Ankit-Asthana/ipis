package org.example.repo;

import org.example.model.AnotherChildEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public  interface AnotherChildEntityRepository extends JpaRepository<AnotherChildEntity, Integer>{

}
