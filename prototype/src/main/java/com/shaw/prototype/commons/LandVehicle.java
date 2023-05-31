package com.shaw.prototype.commons;

import com.shaw.prototype.Prototype;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author shaw
 * @date 2023/5/17
 */
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public abstract class LandVehicle extends Prototype<LandVehicle> {

    public LandVehicle(LandVehicle source) {
    }

}

