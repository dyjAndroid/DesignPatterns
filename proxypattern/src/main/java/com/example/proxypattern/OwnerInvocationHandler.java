package com.example.proxypattern;

import com.example.proxypattern.intf.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * created by Sunday
 * on 2019-06-20 14:41
 */
public class OwnerInvocationHandler implements InvocationHandler {

    private PersonBean mPersonBean;

    public OwnerInvocationHandler(PersonBean personBean) {
        mPersonBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {

        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(mPersonBean,args);
            } else if (method.getName().startsWith("set")) {
                return method.invoke(mPersonBean,args);
            } else if (method.getName().equals("setHotOrNotRating")){
                throw new IllegalAccessException();
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
