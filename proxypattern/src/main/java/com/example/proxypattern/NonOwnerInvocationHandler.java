package com.example.proxypattern;

import com.example.proxypattern.intf.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * created by Sunday
 * on 2019-06-20 14:46
 */
public class NonOwnerInvocationHandler implements InvocationHandler {

    private PersonBean mPersonBean;

    public NonOwnerInvocationHandler(PersonBean personBean) {
        mPersonBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(mPersonBean, args);
            } else if (method.getName().startsWith("set")) {
                throw new IllegalAccessException();
            } else if (method.getName().equals("setHotOrNotRating")) {
                return method.invoke(mPersonBean, args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
