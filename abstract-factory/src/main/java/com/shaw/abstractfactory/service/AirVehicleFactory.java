package com.shaw.abstractfactory.service;

import com.shaw.abstractfactory.bean.AirVehicle;

/**
 * @author shaw
 * @date 2023/5/17
 */
public interface AirVehicleFactory {

    String getDescription();

    AirVehicle getAirVehicle();
}
