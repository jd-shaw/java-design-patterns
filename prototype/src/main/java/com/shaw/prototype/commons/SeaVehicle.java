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
public abstract class SeaVehicle extends Prototype<SeaVehicle> {

    public SeaVehicle(SeaVehicle source) {
    }

}

