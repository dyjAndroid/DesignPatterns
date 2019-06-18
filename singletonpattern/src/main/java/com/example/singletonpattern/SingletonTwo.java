package com.example.singletonpattern;

/**
 * created by Sunday
 * on 2019-06-18 10:33
 * 饿汗式，不会存在多线程的那种问题
 */
public class SingletonTwo {

    /**
     * JVM 在加载这个类时，就会创建这个实例。
     * JVM保证任何线程访问 mInstance静态变量之前，一定先创建实例。
     */
    private static SingletonTwo mInstance = new SingletonTwo();

    private SingletonTwo() {

    }

    public static SingletonTwo getInstance() {
        return mInstance;
    }
}
