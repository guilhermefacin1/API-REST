package com.api.Rest.API.controller;

import com.api.Rest.API.model.User;
import com.api.Rest.API.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping
    public List<User> list(){
        return repository.findAll();
    }
    @PostMapping
    public void save(@RequestBody User user){
        repository.save(user);
    }
    @PutMapping
    public void update(@RequestBody User user){
        repository.save(user);
    }
    @GetMapping("/{name}")
    public User find(@PathVariable("/username") String name){
        return repository.findByUsername(name);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("/id") Integer id){
        repository.deleteById(id);
    }
}
