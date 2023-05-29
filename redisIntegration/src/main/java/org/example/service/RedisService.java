package org.example.service;

import org.example.model.Equipments;
import org.example.repo.RedisRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RedisService {
    @Autowired
    private RedisRepo redisRepo;

    @Cacheable(cacheNames = "equipments")
    public List<Equipments> getAllEquipments() {
        return redisRepo.findAll();
    }

    @Cacheable(cacheNames = "equipment",key = "#id")
    public Equipments getEquipmentById(Long id) {
        return redisRepo.findById(id).orElse(null);
    }

    public List<Equipments> getEquipmentsByUsed(Boolean isUsed) {
        return redisRepo.findByUsed(isUsed);
    }

    public Equipments addEquipment(Equipments equipments) {
        return redisRepo.save(equipments);
    }
}

