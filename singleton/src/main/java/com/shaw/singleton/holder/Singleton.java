package com.shaw.singleton.holder;

/**
 * 静态内部类
 * <p>
 * 特点:效果类似DCL,只适用于静态域
 * <p>
 *
 * @author shaw
 * @date 2023/5/16
 */
public class Singleton {

    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
