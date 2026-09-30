package org.Task.Interfaces_Implement;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class LoggingAfterReturn implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("After method: " + method.getName() + " with args: " + args + "with Return Value is "+returnValue );
    }
}
