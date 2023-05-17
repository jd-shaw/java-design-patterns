package com.shaw.abstractfactory.service;

import com.shaw.abstractfactory.bean.SeaVehicle;

/**
 * @author shaw
 * @date 2023/5/17
 */
public interface SeaVehicleFactory {

    String getDescription();

    SeaVehicle getSeaVehicle();
}
