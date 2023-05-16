package com.shaw.singleton.locking;

/**
 * @author shaw
 * @date 2023/5/16
 */
public class SingletonTest {

    //如果您看到相同的值，则单例被重用：
    //如果您看到不同的值，则创建了 2 个单例：
    public static void main(String[] args) {
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton.toString());
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton.toString());
        }
    }

}
