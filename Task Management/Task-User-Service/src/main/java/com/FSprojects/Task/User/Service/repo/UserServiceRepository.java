package com.FSprojects.Task.User.Service.repo;

import com.FSprojects.Task.User.Service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserServiceRepository extends JpaRepository<User,Long> {
    public User findByEmail(String email);

}
