# Java设计模式：单例模式

单例模式（Singleton Pattern）是 Java 中最简单的设计模式之一。单例模式确保一个类只有一个实例，并提供全局访问点。它在需要共享资源或限制实例化数量时非常有用。

优点：
- 提供全局唯一的实例，方便访问和共享。
- 延迟实例化，节约资源。

缺点：
- 多线程环境下需要考虑线程安全。
- 单例的生命周期与应用相同，可能导致资源长时间占用。

适用场景：
- 日志记录器、数据库连接池等需要全局访问的对象。
- 资源共享、配置信息等。

## 热切初始化单例(eagerly initialized singleton)
示例代码：
```java
public class Singleton {
    private static Singleton instance;
    
    private Singleton() {
        // 私有构造函数
    }
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```
上述代码是日常中最基本的单例实现代码，也是最常见的示例代码，我们通常把这种实现方法称之为`热切初始化单例(eagerly initialized singleton)`


## 延迟初始化单例(lazily initialized singleton)
示例代码：
```java
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
```

## 双重检验锁(double checked locking)
示例代码：
```java
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
```

## 静态内部类
示例代码：
```java
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
```

## 枚举单例
示例代码：
```java
public enum Singleton {

    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}

```

# 与其他模式的关系
- 外观模式类通常可以转换为单例模式类， 因为在大部分情况下一个外观对象就足够了。
- 如果你能将对象的所有共享状态简化为一个享元对象， 那么享元模式就和单例类似了。 但这两个模式有两个根本性的不同。
    -  只会有一个单例实体， 但是享元类可以有多个实体， 各实体的内在状态也可以不同。
    -  单例对象可以是可变的。 享元对象是不可变的。
- 抽象工厂模式、 生成器模式和原型模式都可以用单例来实现。



