package org.Task.Anotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class aop_anotation {

    @Before("execution(* org.Task.Anotation.Service..*(..))")
    public void logBefore(JoinPoint jp) {
        System.out.println("BEFORE: " + jp.getSignature());
    }

    @After("execution(* org.Task.Anotation.Service..*(..))")
    public void logAfter(JoinPoint jp) {
        System.out.println("AFTER (always runs): " + jp.getSignature());
    }


    @AfterReturning(
            pointcut = "execution(* org.Task.Anotation.Service..*(..))",
            returning = "result"
    )
    public void logSuccess(JoinPoint jp, Object result) {
        System.out.println("SUCCESS: " + jp.getSignature() + " returned " +
                result);
    }
}
