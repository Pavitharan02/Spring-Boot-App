package com.nimbusventure.routeoptimizer.service;

import com.nimbusventure.routeoptimizer.model.User;
import com.nimbusventure.routeoptimizer.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User addUser(User user){
        user.setUser_id(UUID.randomUUID().toString());
        return userRepo.save(user);
    }

    public List<User> findAllUser() {
        return userRepo.findAll();
    }

    public User updateUser(User user){
        return userRepo.save(user);
    }

    public User deleteUser(User user){
        userRepo.deleteUserByID(user_id);
    }
}
