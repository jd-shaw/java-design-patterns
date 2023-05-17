package com.shaw.abstractfactory.service.impl;

import com.shaw.abstractfactory.bean.AirVehicle;
import com.shaw.abstractfactory.bean.LandVehicle;
import com.shaw.abstractfactory.bean.SeaVehicle;
import com.shaw.abstractfactory.service.AirVehicleFactory;
import com.shaw.abstractfactory.service.LandVehicleFactory;
import com.shaw.abstractfactory.service.MachineFactory;
import com.shaw.abstractfactory.service.SeaVehicleFactory;

/**
 * @author shaw
 * @date 2023/5/17
 */
public class ChinaMachineFactory implements MachineFactory {

    @Override
    public AirVehicleFactory createAirVehicle() {
        return new ChinaAirVehicleFactory();
    }

    @Override
    public LandVehicleFactory createLandVehicle() {
        return new ChinaLandVehicleFactory();
    }

    @Override
    public SeaVehicleFactory createSeaVehicle() {
        return new ChinaSeaVehicleFactory();
    }
}
