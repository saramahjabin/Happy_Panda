package com.dao;

import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Transactional
    public void saveUser(User user){
        this.hibernateTemplate.save(user);
    }
}
