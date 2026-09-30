package org.Task.Interfaces_Implement;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class AfterThrows implements ThrowsAdvice{
    public void afterThrowing(Method method, Object[] args, Object target, Exception ex) throws Throwable {
        System.out.println("Exception thrown in method: " + method.getName() + " with args: " + args + " Exception: " + ex);
    }
}
