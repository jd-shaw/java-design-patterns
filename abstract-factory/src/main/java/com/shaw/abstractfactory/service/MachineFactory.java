package com.shaw.abstractfactory.service;

import com.shaw.abstractfactory.bean.AirVehicle;
import com.shaw.abstractfactory.bean.LandVehicle;
import com.shaw.abstractfactory.bean.SeaVehicle;

/**
 * 机器生产车间
 *
 * @author shaw
 * @date 2023/5/17
 */
public interface MachineFactory {

    AirVehicleFactory createAirVehicle();

    LandVehicleFactory createLandVehicle();

    SeaVehicleFactory createSeaVehicle();

}
