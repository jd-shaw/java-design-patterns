package com.shaw.prototype.bean;

import com.shaw.prototype.commons.AirVehicle;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author xjd
 * @date 2023/5/24
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class USFightAirVehicle extends AirVehicle {

    private final String type;

    public USFightAirVehicle(USFightAirVehicle airVehicle) {
        super(airVehicle);
        this.type = airVehicle.type;
    }

    @Override
    public String toString() {
        return "US fight air vehicle type:" + type;
    }

}
