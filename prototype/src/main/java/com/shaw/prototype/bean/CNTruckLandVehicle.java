package com.shaw.prototype.bean;

import com.shaw.prototype.commons.LandVehicle;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author xjd
 * @date 2023/5/24
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class CNTruckLandVehicle extends LandVehicle {

    private final String type;

    public CNTruckLandVehicle(CNTruckLandVehicle landVehicle) {
        super(landVehicle);
        this.type = landVehicle.type;
    }

    @Override
    public String toString() {
        return "CN Truck land vehicle type:" + type;
    }

}

