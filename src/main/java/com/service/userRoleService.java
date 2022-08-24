package com.service;


import com.dao.UserRoleDao;
import com.model.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class userRoleService {
    @Autowired
    private UserRoleDao userRoleDao;
    public UserRole getRoleUser(){
     return this.userRoleDao.getRoleUser();
        }

}
