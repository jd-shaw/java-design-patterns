package com.shaw.prototype;

import lombok.SneakyThrows;

/**
 * @author shaw
 * @date 2023/5/22
 */
public abstract class Prototype<T> implements Cloneable {
    /**
     * Object 此对象的浅表副本，如果此对象不可克隆，则为 null。
     */
    @SuppressWarnings("unchecked")
    @SneakyThrows
    public T copy() {
        return (T) super.clone();
    }
}
