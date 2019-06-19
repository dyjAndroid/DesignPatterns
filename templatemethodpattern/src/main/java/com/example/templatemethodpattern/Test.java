package com.example.templatemethodpattern;

/**
 * created by Sunday
 * on 2019-06-19 11:23
 * 模板方法模式：在一个方法中定义一个算法的框架，而将一些步骤延迟到子类中。模板方法使得子类在不改变算法结构的情况下，重新定义算法中的某些步骤。
 */
public class Test {

    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
