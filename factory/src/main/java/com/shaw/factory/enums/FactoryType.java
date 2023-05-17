package com.shaw.factory.enums;

import com.shaw.factory.service.Factory;
import com.shaw.factory.service.impl.FactoryBike;
import com.shaw.factory.service.impl.FactoryCar;

import java.util.function.Supplier;

/**
 * @author shaw
 * @date 2023/5/16
 */
public enum FactoryType {

    BIKE(FactoryBike::new),
    CAR(FactoryCar::new);

    private final Supplier<Factory> constructor;

    private FactoryType(Supplier<Factory> constructor) {
        this.constructor = constructor;
    }

    public Factory createFactory() {
        return constructor.get();
    }

    public Supplier<Factory> getConstructor() {
        return constructor;
    }
}
