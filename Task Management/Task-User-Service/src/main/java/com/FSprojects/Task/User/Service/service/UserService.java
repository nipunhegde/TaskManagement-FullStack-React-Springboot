package com.FSprojects.Task.User.Service.service;

import com.FSprojects.Task.User.Service.model.User;

import java.util.List;

public interface UserService {
    public User findUserProfileByJwt(String jwt);
    public List<User> findAllUsers();
}
