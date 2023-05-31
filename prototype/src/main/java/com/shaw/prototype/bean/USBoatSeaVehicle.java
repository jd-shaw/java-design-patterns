package com.shaw.prototype.bean;

import com.shaw.prototype.commons.AirVehicle;
import com.shaw.prototype.commons.SeaVehicle;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author shaw
 * @date 2023/5/24
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class USBoatSeaVehicle extends SeaVehicle {

    private final String type;

    public USBoatSeaVehicle(USBoatSeaVehicle seaVehicle) {
        super(seaVehicle);
        this.type = seaVehicle.type;
    }

    @Override
    public String toString() {
        return "US boat sea vehicle type:" + type;
    }

}
