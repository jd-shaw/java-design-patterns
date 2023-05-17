package com.shaw.abstractfactory.service.impl;

import com.shaw.abstractfactory.bean.SeaVehicle;
import com.shaw.abstractfactory.service.SeaVehicleFactory;

/**
 * @author shaw
 * @date 2023/5/17
 */
public class ChinaSeaVehicleFactory implements SeaVehicleFactory {

    private static final String DESCRIPTION = "中国海上载具工厂";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public SeaVehicle getSeaVehicle() {
        return new SeaVehicle();
    }
}

