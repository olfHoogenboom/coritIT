package com.corit.solutions.service;

import com.corit.solutions.entities.User_roles;
import com.corit.solutions.entities.Users;
import com.corit.solutions.repository.RoleRepository;
import com.corit.solutions.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Iterable<Users> listAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<Users> getUserByName(String username) {
        return userRepository.findById(username);
    }


    @Override
    public Users saveUser(Users users) {
        User_roles roles = new User_roles(users.getUsername());
        roleRepository.save(roles);
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        users.setPassword(bCryptPasswordEncoder.encode(users.getPassword()));
        return userRepository.save(users);
    }

    @Override
    public void deleteUser(String username) {
        userRepository.deleteById(username);
    }


}
