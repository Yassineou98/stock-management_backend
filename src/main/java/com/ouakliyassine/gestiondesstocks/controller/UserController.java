package com.ouakliyassine.gestiondesstocks.controller;


import com.ouakliyassine.gestiondesstocks.entites.Utilisateur;
import com.ouakliyassine.gestiondesstocks.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    List<Utilisateur> getAllUsers() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    Utilisateur getUserById(@PathVariable Long id) {
        return userService.consulteruser(id);
    }

    @PostMapping
    void saveUser(@RequestBody Utilisateur user) {
        userService.ajouteruser(user);
    }

    @PutMapping
    void updateUser(@RequestBody Utilisateur user){
        userService.modifieruser(user);
    }

    @DeleteMapping("/{id}")
    void deleteUser(@PathVariable Long id ){
        userService.supprimeruser(id);
    }


}
