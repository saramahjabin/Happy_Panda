package com.dao;

import com.model.Product;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ProductDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Transactional
    public Product getProductByName(String name) {
        Session session=sessionFactory.getCurrentSession();
        Criteria crit=session.createCriteria(Product.class).add(Restrictions.eq("name", name));
        //crit.add(Restrictions.eq("user_name", userName));
        return (Product)crit.uniqueResult();
}
}
