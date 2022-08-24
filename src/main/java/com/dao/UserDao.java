package com.dao;

import com.model.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class UserDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Autowired
    private SessionFactory sessionFactory;
    @Transactional
    public void saveUser(User user){
        this.hibernateTemplate.save(user);
    }
    public List<User> getUsers(){
        List<User> users = this.hibernateTemplate.loadAll(User.class);
        return users;
    }
    @Transactional
    public void deleteUser(int uid){
        User u = this.hibernateTemplate.load(User.class,uid);
        this.hibernateTemplate.delete(u);
    }
    public User getUser(int uid){
       // this.hibernateTemplate.get
        return this.hibernateTemplate.get(User.class,uid) ;
    }
    @Transactional
    public User getUserByUsername(String username) {
        Session session=sessionFactory.getCurrentSession();
        Criteria crit=session.createCriteria(User.class).add(Restrictions.eq("username", username));
        //crit.add(Restrictions.eq("user_name", userName));
        return (User)crit.uniqueResult();
      /*  return (User) sessionFactory.getCurrentSession()
                .createCriteria(User.class)
                .add(Restrictions.eq("username", username))
                .uniqueResult();*/
    }
}
