package com.shaw.abstractfactory.service.impl;

import com.shaw.abstractfactory.service.AirVehicleFactory;
import com.shaw.abstractfactory.service.LandVehicleFactory;
import com.shaw.abstractfactory.service.MachineFactory;
import com.shaw.abstractfactory.service.SeaVehicleFactory;

/**
 * @author shaw
 * @date 2023/5/17
 */
public class AmericanMachineFactory implements MachineFactory {

    @Override
    public AirVehicleFactory createAirVehicle() {
        return new AmericanAirVehicleFactory();
    }

    @Override
    public LandVehicleFactory createLandVehicle() {
        return new AmericanLandVehicleFactory();
    }

    @Override
    public SeaVehicleFactory createSeaVehicle() {
        return new AmericanSeaVehicleFactory();
    }
}

