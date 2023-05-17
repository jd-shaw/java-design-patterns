package com.shaw.abstractfactory.service.impl;

import com.shaw.abstractfactory.bean.LandVehicle;
import com.shaw.abstractfactory.service.LandVehicleFactory;

/**
 * @author shaw
 * @date 2023/5/17
 */
public class AmericanLandVehicleFactory implements LandVehicleFactory {

    private static final String DESCRIPTION = "美国陆上载具工厂";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }


    @Override
    public LandVehicle getLandVehicle() {
        return new LandVehicle();
    }
}
