package org.example;
import org.example.service.AggregatorService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aggregate")
public class AggregatorController {
    @Autowired
    AggregatorService aggregatorService;
    @GetMapping("/add")
    public String aggregateValue(){
        return aggregatorService.aggregateValue();

    }

    @GetMapping("/start")
    public String grt(){
        return "Started";
    }
}
