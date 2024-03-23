package com.FSprojects.Task.User.Service.service;

import com.FSprojects.Task.User.Service.config.JWTProvider;
import com.FSprojects.Task.User.Service.model.User;
import com.FSprojects.Task.User.Service.repo.UserServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserServiceRepository userRepository;
    @Override
    public User findUserProfileByJwt(String jwt) {
        String email= JWTProvider.getEmailFromJwtToken(jwt);


        User user = userRepository.findByEmail(email);

//        if(user==null) {
//            throw new Exception("user not exist with email "+email);
//        }
        return user;
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();

    }

}

