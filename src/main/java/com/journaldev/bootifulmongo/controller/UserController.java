package com.journaldev.bootifulmongo.controller;


import com.journaldev.bootifulmongo.dal.UserRepository;
import com.journaldev.bootifulmongo.model.User;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
@AllArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @GetMapping
    public List<User> getAll(){
        log.info("Retornando todos usuarios");
        return userRepository.findAll();
    }

    @PostMapping
    public User create(@RequestBody User user) {
        log.info("Criando usuário");
        return userRepository.save(user);
    }

}
