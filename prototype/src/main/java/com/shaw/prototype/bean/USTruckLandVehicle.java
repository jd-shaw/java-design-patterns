package com.shaw.prototype.bean;

import com.shaw.prototype.commons.AirVehicle;
import com.shaw.prototype.commons.LandVehicle;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author shaw
 * @date 2023/5/24
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class USTruckLandVehicle extends LandVehicle {

    private final String type;

    public USTruckLandVehicle(USTruckLandVehicle landVehicle) {
        super(landVehicle);
        this.type = landVehicle.type;
    }

    @Override
    public String toString() {
        return "US Truck land vehicle type:" + type;
    }

}

