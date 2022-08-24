package com.service;

import com.dao.CartDao;
import com.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CartService {
    @Autowired
    private CartDao cartDao;

    public void createCart(Cart cart){
        this.cartDao.saveCart(cart);
    }
    public List<Cart> fetchCart(){
        return this.cartDao.getCart();
    }
    public void deleteCart(){
        this.cartDao.deleteCart();
    }

}
