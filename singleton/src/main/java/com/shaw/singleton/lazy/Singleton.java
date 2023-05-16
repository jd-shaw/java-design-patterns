package com.shaw.singleton.lazy;

/**
 * 线程安全的单例类。 实例被惰性初始化，因此需要同步机制
 *
 * @author shaw
 * @date 2023/5/16
 */
public class Singleton {

    // 该字段必须声明为 volatile，以便双重检查锁可以正常工作。
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(value);
                }
            }
        }
        return instance;
    }

}
