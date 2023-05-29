package org.example.repo;

import org.example.model.Equipments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RedisRepo extends JpaRepository<Equipments,Long> {
    @Query("select e FROM Equipments e where e.isUsed=:isUsed")
    List<Equipments> findByUsed(@Param("isUsed") Boolean isUsed);
}

