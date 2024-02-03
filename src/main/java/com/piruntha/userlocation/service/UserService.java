package com.piruntha.userlocation.service;

import com.piruntha.userlocation.entity.User;
import com.piruntha.userlocation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User addUser(User user){
        return userRepository.save(user);
    }
}
