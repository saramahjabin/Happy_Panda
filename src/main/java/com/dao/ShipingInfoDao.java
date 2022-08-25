package com.dao;

import com.model.ShipingInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ShipingInfoDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Transactional
    public void saveShipingInfo(ShipingInfo shipingInfo){
        this.hibernateTemplate.save(shipingInfo);
    }
}
