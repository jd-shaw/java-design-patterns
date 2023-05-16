package com.shaw.singleton.lazy;

import com.shaw.singleton.lazy.Singleton;

/**
 * @author shaw
 * @date 2023/5/16
 */
public class SingletonTest {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }

}
