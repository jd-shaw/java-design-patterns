package com.shaw.abstractfactory.commons;

import com.shaw.abstractfactory.service.MachineFactory;
import com.shaw.abstractfactory.service.impl.AmericanMachineFactory;
import com.shaw.abstractfactory.service.impl.ChinaMachineFactory;

/**
 * @author shaw
 * @date 2023/5/17
 */
public class FactoryMaker {

    public enum CountryType {
        CN, US
    }

    //这段代码的设计目的是提供一种方便的方式来创建工厂。
    // 通过FactoryMaker类的makeFactory方法，可以根据需要创建不同国家，进而创建特定类型的国家机器工厂。
    // 这种设计模式可以将创建对象的逻辑封装起来，并根据需要灵活地切换和扩展不同类型的工厂。
    public static MachineFactory makeFactory(CountryType type) {
        switch (type) {
            case CN:
                return new ChinaMachineFactory();
            case US:
                return new AmericanMachineFactory();
            default:
                throw new IllegalArgumentException("country not supported.");
        }
    }

}
