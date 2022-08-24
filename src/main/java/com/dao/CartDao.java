package com.dao;


import com.model.Cart;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Component
public class CartDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Transactional
    public void saveCart(Cart cart){
        this.hibernateTemplate.save(cart);
    }
    public List<Cart> getCart(){
        List<Cart> carts = this.hibernateTemplate.loadAll(Cart.class);
        return carts;
    }
    @Transactional
    public void deleteCart(){
        //User u = this.hibernateTemplate.load(User.class,uid);
        //this.hibernateTemplate.delete(u);
        this.hibernateTemplate.deleteAll(getCart());
    }
}
