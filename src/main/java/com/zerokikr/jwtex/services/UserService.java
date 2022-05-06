package com.zerokikr.jwtex.services;

import com.zerokikr.jwtex.entities.Role;
import com.zerokikr.jwtex.entities.User;
import com.zerokikr.jwtex.repositories.RolesRepository;
import com.zerokikr.jwtex.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private RolesRepository rolesRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User saveUser (User user) {
        Role role = rolesRepository.findByName("ROLE_ADMIN");
        user.setRole(role);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return usersRepository.save(user);
    }

    public User fingByLogin (String login) {
        return usersRepository.findByLogin(login);
    }

    public User findByLoginAndPassword (String login, String password) {
        User user = fingByLogin(login);
        if (user != null) {
            if (passwordEncoder.matches(password, user.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
