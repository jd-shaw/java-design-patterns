package com.shaw.factory;

import com.shaw.factory.enums.FactoryType;
import com.shaw.factory.service.Factory;
import com.shaw.factory.service.impl.TransportationFactory;

/**
 * @author xjd
 * @date 2023/5/16
 */
public class FactoryTest {

    public static void main(String[] args) {
        Factory factory1 = TransportationFactory.getFactory(FactoryType.BIKE);
        Factory factory2 = TransportationFactory.getFactory(FactoryType.CAR);
        System.out.println(factory1.getDescription());
        System.out.println(factory2.getDescription());
    }

}
