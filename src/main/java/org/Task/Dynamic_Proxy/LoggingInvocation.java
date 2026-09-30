package org.Task.Dynamic_Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingInvocation implements InvocationHandler {

    private Object target;

    public LoggingInvocation(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("LOG: Before method execution");
        Object result = method.invoke(target, args);
        System.out.println("LOG: After method execution");
        return result;
    }
}
