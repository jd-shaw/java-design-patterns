package com.shaw.prototype.bean;

import com.shaw.prototype.commons.AirVehicle;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author shaw
 * @date 2023/5/24
 */
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
public class CNFightAirVehicle extends AirVehicle {

    private final String type;

    public CNFightAirVehicle(CNFightAirVehicle airVehicle) {
        super(airVehicle);
        this.type = airVehicle.type;
    }

    @Override
    public String toString() {
        return "CN fight air vehicle type:" + type;
    }

}
