package com.shaw.singleton.locking;

/**
 * 线程安全的单例类。 实例被惰性初始化，因此需要同步机制
 *
 * @author shaw
 * @date 2023/5/16
 */
public class Singleton {

    private static volatile Singleton instance;

    /**
     * 私有构造函数以防止客户端实例化。
     */
    private Singleton() {
        // to prevent instantiating by Reflection call
        if (instance != null) {
            throw new IllegalStateException("Already initialized.");
        }
    }

    public static Singleton getInstance() {
        Singleton result = instance;
        // 检查单例实例是否已初始化。
        // 如果已初始化，则可以返回实例。
        if (result == null) {
            // 尚未初始化，但不能确定，因为其他线程可能在此期间进行了初始化。
            // 因此，为了确保，我们需要在对象上加锁以获得互斥。
            synchronized (Singleton.class) {
                // 再次将实例赋值给本地变量，以检查当前线程在被阻塞进入锁定区域时是否被其他线程初始化。
                // 如果已初始化，则可以像之前的空检查一样返回先前创建的实例。
                result = instance;
                if (result == null) {
                    // 仍未初始化，因此我们可以安全地（没有其他线程可以进入此区域）
                    // 创建一个实例并将其设置为我们的单例实例。
                    instance = result = new Singleton();
                }
            }
        }
        return result;
    }


}
