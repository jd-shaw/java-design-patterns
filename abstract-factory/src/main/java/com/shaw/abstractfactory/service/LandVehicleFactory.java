package com.shaw.abstractfactory.service;

import com.shaw.abstractfactory.bean.LandVehicle;

/**
 * @author shaw
 * @date 2023/5/17
 */
public interface LandVehicleFactory {

    String getDescription();

    LandVehicle getLandVehicle();
}
