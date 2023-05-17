package com.shaw.abstractfactory.service.impl;

import com.shaw.abstractfactory.bean.AirVehicle;
import com.shaw.abstractfactory.service.AirVehicleFactory;

/**
 * @author shaw
 * @date 2023/5/17
 */
public class AmericanAirVehicleFactory implements AirVehicleFactory {

    private static final String DESCRIPTION = "美国空中载具工厂";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public AirVehicle getAirVehicle() {
        return new AirVehicle();
    }
}
