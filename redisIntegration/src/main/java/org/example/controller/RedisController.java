package org.example.controller;

import org.example.service.RedisService;
import org.example.model.Equipments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RedisController {
    @Autowired
    private RedisService redisService;

    @GetMapping("/getAllEquipments")
    private List<Equipments> getAllEquipments()
    {
        return redisService.getAllEquipments();
    }
    @PostMapping("addEquipment")
    public  Equipments addEquipment(@RequestBody Equipments equipments){
        return redisService.addEquipment(equipments);
    }
    @GetMapping("/getEquipmentById")
    private Equipments equipments(@RequestParam Long id){
        return redisService.getEquipmentById(id);
    }
    @GetMapping("/getEquipmentByUsed")
    private List<Equipments> getEquipmentByUsed(@RequestParam boolean isUsed)
    {
        return redisService.getEquipmentsByUsed(isUsed);
    }
}

