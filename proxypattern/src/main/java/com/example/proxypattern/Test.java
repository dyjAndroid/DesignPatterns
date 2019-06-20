package com.example.proxypattern;

import com.example.proxypattern.intf.PersonBean;

import java.lang.reflect.Proxy;

/**
 * created by Sunday
 * on 2019-06-20 14:03
 * 代理模式：为另一个对象提供一个提升或占位符以控制对这个对象的访问。
 * 远程代理、虚拟代理、保护代理、动态代理
 */
public class Test {

    public static void main(String[] args) {

    }

    private PersonBean getOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(), new OwnerInvocationHandler(personBean));
    }

    private PersonBean getNonOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(), new NonOwnerInvocationHandler(personBean));
    }
}
