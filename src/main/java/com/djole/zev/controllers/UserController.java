package com.djole.zev.controllers;

import com.djole.zev.models.User;
import com.djole.zev.repo.UserRepository;
import com.djole.zev.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping("/zev")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id){

        return ResponseEntity.ok(service.getUserById(id));
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getusers(){

        return ResponseEntity.ok(service.getAllUsers());
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user){

        return ResponseEntity.ok(service.saveUser(user));
    }
}
