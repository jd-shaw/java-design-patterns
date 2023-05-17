package com.shaw.factory.service.impl;

import com.shaw.factory.enums.FactoryType;
import com.shaw.factory.service.Factory;

/**
 * @author shaw
 * @date 2023/5/16
 */
public class TransportationFactory {

    /**
     * 工厂方法接受一个类型作为参数，并调用相应的类。
     */
    public static Factory getFactory(FactoryType type) {
        return type.getConstructor().get();
    }

}
