package com.designpatterns.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SecurityProxy implements InvocationHandler {
    private Object obj;
    private SecurityProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;

        try {
            if(method.getName().contains("post")) {
                throw new IllegalAccessException("Currently Post is not allowed");
            } else {
                result = method.invoke(obj, args);
            }
        } catch ( InvocationTargetException e) {
            throw new RuntimeException("unexpected invocation exception: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("unexpected exception: " + e.getMessage());
        }

        return result;
    }

    public static Object newInstance(Object obj) {
        return java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(), new SecurityProxy(obj));
    }
}
