package com.shaw.singleton.enums;

/**
 * 枚举单例
 *
 * @author shaw
 * @date 2023/5/16
 */
public enum Singleton {

    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
