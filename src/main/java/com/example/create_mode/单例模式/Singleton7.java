package com.example.create_mode.单例模式;


import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;
import java.lang.reflect.Constructor;

/**
 * 静态内部类[推荐用]
 * 通过静态内部类的方式实现单例模式是线程安全的，同时静态内部类不会在Singleton类加载时就加载，
 * 而是在调用getInstance()方法时才进行加载，达到了懒加载的效果。
 *
 * 似乎静态内部类看起来已经是最完美的方法了，其实不是，可能还存在反射攻击或者反序列化攻击
 */
public class Singleton7 implements Serializable {
    private Singleton7() {
    }

    private static class SingletonInstance {
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    public static Singleton7 getInstance() {
        return SingletonInstance.INSTANCE;
    }

    public static void main(String[] args) throws Exception {
        Singleton7 singleton = Singleton7.getInstance();
        //反射攻击
        Constructor<Singleton7> constructor = Singleton7.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton7 newSingleton = constructor.newInstance();
        System.out.println(singleton == newSingleton);  //false 这两个实例不是同一个，这就违背了单例模式的原则了

        //反序列化攻击 Singleton7类实现java.io.Serializable接口。
        byte[] serialize = SerializationUtils.serialize(singleton);
        Singleton7 newInstance = SerializationUtils.deserialize(serialize);
        System.out.println(singleton == newInstance);  //false 这两个实例不是同一个，这就违背了单例模式的原则了
    }
}
