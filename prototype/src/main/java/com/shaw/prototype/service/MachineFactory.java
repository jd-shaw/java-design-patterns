package com.shaw.prototype.service;

import com.shaw.prototype.commons.AirVehicle;
import com.shaw.prototype.commons.LandVehicle;
import com.shaw.prototype.commons.SeaVehicle;

/**
 * 机器生产车间
 *
 * @author shaw
 * @date 2023/5/17
 */
public interface MachineFactory {

    AirVehicle createAirVehicle();

    LandVehicle createLandVehicle();

    SeaVehicle createSeaVehicle();

}
