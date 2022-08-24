package com.service;

import com.dao.RestaurantDao;
import com.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
    @Autowired
    private RestaurantDao restaurantDao;
    public Restaurant fetchRestaurantByName(String name){
        return this.restaurantDao.getRestaurantByName(name);
    }
    public Restaurant fetchRestaurantById(int id){return this.restaurantDao.getRestaurantById(id);}
}
