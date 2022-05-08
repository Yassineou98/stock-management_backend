package com.ouakliyassine.gestiondesstocks.services;

import com.ouakliyassine.gestiondesstocks.entites.Utilisateur;
import com.ouakliyassine.gestiondesstocks.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void ajouteruser(Utilisateur user) {
        userRepository.save(user);
    }

    @Override
    public void supprimeruser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void modifieruser(Utilisateur user) {
        userRepository.save(user);
    }

    @Override
    public Utilisateur consulteruser(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<Utilisateur> getAll() {
       return userRepository.findAll();
    }
}
