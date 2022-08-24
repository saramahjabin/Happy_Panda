package com.dao;

import com.model.Restaurant;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class RestaurantDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Transactional
    public Restaurant getRestaurantByName(String name) {
        Session session=sessionFactory.getCurrentSession();
        Criteria crit=session.createCriteria(Restaurant.class).add(Restrictions.eq("name", name));
        //crit.add(Restrictions.eq("user_name", userName));
        return (Restaurant)crit.uniqueResult();
    }
    @Transactional
    public Restaurant getRestaurantById(int id) {
        Session session=sessionFactory.getCurrentSession();
        Criteria crit=session.createCriteria(Restaurant.class).add(Restrictions.eq("id", id));
        //crit.add(Restrictions.eq("user_name", userName));
        return (Restaurant)crit.uniqueResult();
    }
}
