package com.service;

import com.dao.ShipingInfoDao;
import com.model.ShipingInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipingInfoService {
    @Autowired
    private ShipingInfoDao shipingInfoDao;
    public void createShipingInfo(ShipingInfo shipingInfo){
        this.shipingInfoDao.saveShipingInfo(shipingInfo);
    }
}
