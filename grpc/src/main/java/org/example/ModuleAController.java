package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class ModuleAController {

    private final ModuleAService moduleAService;

    public ModuleAController(ModuleAService moduleAService) {
        this.moduleAService = moduleAService;
    }

    @GetMapping("/greet")
    public String Hello(@RequestParam String name) {
        return moduleAService.sayHello(name);
    }
}