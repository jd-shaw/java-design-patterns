package com.shaw.factory.service.impl;

import com.shaw.factory.service.Factory;

/**
 * @author xjd
 * @date 2023/5/16
 */
public class FactoryCar implements Factory {

    static final String DESCRIPTION = "汽车生产工厂";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

}
