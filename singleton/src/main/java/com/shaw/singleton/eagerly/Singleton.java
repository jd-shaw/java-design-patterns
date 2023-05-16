package com.shaw.singleton.eagerly;

/**
 *
 * 热切初始化单例
 *
 * @author shaw
 * @date 2023/5/16
 */
public class Singleton {

    // 构造方法私有化
    private Singleton() {

    }

    private static Singleton singleton = new Singleton();

    public static Singleton getInstance() {
        return singleton;
    }

}
