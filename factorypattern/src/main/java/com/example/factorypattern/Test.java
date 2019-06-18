package com.example.factorypattern;

import com.example.factorypattern.pizza.Pizza;

import java.util.Random;

/**
 * created by Sunday
 * on 2019-06-17 09:41
 *
 * 工厂模式：定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。
 * 工厂方法让类把实例化推迟到子类。
 */
public class Test {

    public static void main(String[] args) {
//        PizzaStore nyStore = new NYPizzaStore();
//        Pizza pizza = nyStore.orderPizza("cheese");
//        System.out.println("Ethan order a " + pizza.getName() + "\n");
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            System.out.println("number:" + random.nextInt(2) );
        }
    }
}
