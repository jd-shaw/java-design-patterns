package com.shaw.prototype.service.impl;

import com.shaw.prototype.commons.AirVehicle;
import com.shaw.prototype.commons.LandVehicle;
import com.shaw.prototype.commons.SeaVehicle;
import com.shaw.prototype.service.MachineFactory;
import lombok.RequiredArgsConstructor;

/**
 * @author xjd
 * @date 2023/5/24
 */
@RequiredArgsConstructor
public class MachineFactoryImpl implements MachineFactory {

    private final AirVehicle airVehicle;
    private final LandVehicle landVehicle;
    private final SeaVehicle seaVehicle;

    @Override
    public AirVehicle createAirVehicle() {
        return airVehicle.copy();
    }

    @Override
    public LandVehicle createLandVehicle() {
        return landVehicle.copy();
    }

    @Override
    public SeaVehicle createSeaVehicle() {
        return seaVehicle.copy();
    }

}
