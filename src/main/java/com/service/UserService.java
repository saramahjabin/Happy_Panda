package com.service;

import com.dao.UserDao;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public void createUser(User user){
      this.userDao.saveUser(user);
    }
    public User fetchUser(int uid){
        return this.userDao.getUser(uid);
    }
    public User fetchUserByUsername(String username){
        return this.userDao.getUserByUsername(username);
    }
}
