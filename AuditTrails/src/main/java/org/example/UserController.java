package org.example;

import org.example.entity.User;
import org.example.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/audit")
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @PostMapping("/saveuser")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return ResponseEntity.ok(userRepo.save(user));
    }
}
