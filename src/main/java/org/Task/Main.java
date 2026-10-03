package org.Task;

import org.Task.Anotation.Service.loggingAOP;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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



        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AnotationConfig.class);

       loggingAOP service =(loggingAOP) ctx.getBean(loggingAOP.class);

        service.heckStock("aaa");


    }
}