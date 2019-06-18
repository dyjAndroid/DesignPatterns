package com.example.singletonpattern;

/**
 * created by Sunday
 * on 2019-06-18 09:46
 * 懒汉式
 */
public class Singleton {

//    private static Singleton mInstance;

    //双重加锁机制
    private volatile static Singleton mInstance;

    private Singleton() {

    }

    /**
     * 多线程访问可能出现 mInstance 不唯一的问题
     */
    /*public static Singleton getInstance() {
        if (mInstance == null) {
            mInstance = new Singleton();
        }
        return mInstance;
    }*/

    /**
     * 通过 synchronized 可以解决多线程的问题，但是，又会带来性能问题。
     * 每次调用这个方法，都会进行同步，但实际上，只有第一次执行此方法时，才需要进行同步。
     * @return mInstance
     */
   /* public synchronized static Singleton getInstance() {
        if (mInstance == null) {
            mInstance = new Singleton();
        }
        return mInstance;
    }*/

    /**
     * 双重加锁机制，保证了只有在第一次调用的时候，才进行同步。
     * 注意：在java 1.4及更早的版本中，许多JVM 对于 volatile 关键字的实现会导致双重检查加锁的失效。
     */
   public static Singleton getInstance() {
       if (mInstance == null) {
           synchronized (Singleton.class) {
               if (mInstance == null) {
                   mInstance = new Singleton();
               }
           }
       }
       return mInstance;
   }
}
