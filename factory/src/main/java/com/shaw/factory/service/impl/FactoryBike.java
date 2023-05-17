package com.shaw.factory.service.impl;

import com.shaw.factory.service.Factory;

/**
 * @author shaw
 * @date 2023/5/16
 */
public class FactoryBike implements Factory {

    static final String DESCRIPTION = "自行车生产工厂";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

}
