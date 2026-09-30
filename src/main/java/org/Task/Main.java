package org.Task;

import org.Task.Dynamic_Proxy.instapayService;
import org.Task.Dynamic_Proxy.paymentService;
import org.Task.Interfaces_Implement.*;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Proxy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Using Dynamic Proxy Lab1
//        paymentService paymentService = new instapayService();
//        paymentService proxy = (paymentService) Proxy.newProxyInstance(
//                paymentService.getClass().getClassLoader(),
//                new Class[]{paymentService.class},
//                new org.Task.Dynamic_Proxy.LoggingInvocation(paymentService)
//        );
//        proxy.pay(100);
//
//    }

    // Using ProxyFactory
//        InventoryService target = new iInventoryServiceImpl();
//
//        ProxyFactory proxyFactory = new ProxyFactory();
//        proxyFactory.setTarget(target);
//        proxyFactory.addAdvice(new LoggingBeforeAdvice());
//        proxyFactory.addAdvice(new LoggingAfterReturn());
//        proxyFactory.addAdvice(new AfterThrows());
//
//        InventoryService proxy = (InventoryService) proxyFactory.getProxy();
//        proxy.heckStock("SKU123");
//         proxy.updateStock("SKU123", 10);
//         // proxy.updateStock("SKU123", -1);

        //Using AnnotationConfigApplicationContext
//        AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext(appConfig.class);
//
//      InventoryServiceImpl proxy = (InventoryServiceImpl)  context.getBean("Proxy", InventoryService.class);
//      proxy.heckStock("SKU123");
//      proxy.updateStock("SKU123", 10);
//      // proxy.updateStock("SKU123", -1);



    }
}