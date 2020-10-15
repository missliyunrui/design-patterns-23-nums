package com.example.create_mode.单例模式;

/**
 * 枚举[最推荐用]
 * 在effective java（这本书真的很棒）中说道，最佳的单例实现模式就是枚举模式。
 * 利用枚举的特性，让JVM来帮我们保证线程安全和单一实例的问题。除此之外，写法还特别简单。
 */
public enum Singleton8 {
    INSTANCE;

    public void doSomething() {
        System.out.println("doSomething");
    }

    public static void main(String[] args) {
        Singleton8.INSTANCE.doSomething();
    }
}
